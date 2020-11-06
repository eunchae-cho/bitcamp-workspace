package com.eomcs.pms;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.dao.mariadb.BoardDaoImpl;
import com.eomcs.pms.dao.mariadb.MemberDaoImpl;
import com.eomcs.pms.dao.mariadb.ProjectDaoImpl;
import com.eomcs.pms.dao.mariadb.TaskDaoImpl;
import com.eomcs.pms.filter.AuthCommandFilter;
import com.eomcs.pms.filter.CommandFilterManager;
import com.eomcs.pms.filter.DefaultCommandFilter;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.LoginCommand;
import com.eomcs.pms.handler.LoginoutCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberDetailCommand;
import com.eomcs.pms.handler.MemberListCommand;
import com.eomcs.pms.handler.MemberUpdateCommand;
import com.eomcs.pms.handler.ProjectAddCommand;
import com.eomcs.pms.handler.ProjectDeleteCommand;
import com.eomcs.pms.handler.ProjectDetailCommand;
import com.eomcs.pms.handler.ProjectListCommand;
import com.eomcs.pms.handler.ProjectUpdateCommand;
import com.eomcs.pms.handler.Request;
import com.eomcs.pms.handler.TaskAddCommand;
import com.eomcs.pms.handler.TaskDeleteCommand;
import com.eomcs.pms.handler.TaskDetailCommand;
import com.eomcs.pms.handler.TaskListCommand;
import com.eomcs.pms.handler.TaskUpdateCommand;
import com.eomcs.pms.handler.WhoamiCommand;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.util.Prompt;

public class App {

 
  Map<String,Object> context = new Hashtable<>();
  

  List<ApplicationContextListener> listeners = new ArrayList<>();

  
  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listeners.remove(listener);
  }

  private void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextInitialized(context);
    }
  }

  private void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }


  public static void main(String[] args) throws Exception {
    App app = new App();

    // 옵저버 등록
    app.addApplicationContextListener(new AppInitListener());

    app.service();
  }

  public void service() throws Exception {

    notifyApplicationContextListenerOnServiceStarted();

    Map<String,Command> commandMap = new HashMap<>();

    Connection con = (Connection) context.get("con");

    BoardDao baordDao = new BoardDaoImpl(con);
    MemberDao memberDao = new MemberDaoImpl(con);
    ProjectDao projectDao = new ProjectDaoImpl(con);
    TaskDao taskDao = new TaskDaoImpl(con);
  
    
    commandMap.put("/board/add", new BoardAddCommand(baordDao,memberDao));
    commandMap.put("/board/list", new BoardListCommand(baordDao));
    commandMap.put("/board/detail", new BoardDetailCommand(baordDao));
    commandMap.put("/board/update", new BoardUpdateCommand(baordDao));
    commandMap.put("/board/delete", new BoardDeleteCommand(baordDao));

    commandMap.put("/member/add", new MemberAddCommand(memberDao));
    commandMap.put("/member/list", new MemberListCommand(memberDao));
    commandMap.put("/member/detail", new MemberDetailCommand(memberDao));
    commandMap.put("/member/update", new MemberUpdateCommand(memberDao));
    commandMap.put("/member/delete", new MemberDeleteCommand(memberDao));

    commandMap.put("/project/add", new ProjectAddCommand(projectDao, memberDao));
    commandMap.put("/project/list", new ProjectListCommand(projectDao));
    commandMap.put("/project/detail", new ProjectDetailCommand(projectDao));
    commandMap.put("/project/update", new ProjectUpdateCommand(projectDao, memberDao));
    commandMap.put("/project/delete", new ProjectDeleteCommand(projectDao));

    commandMap.put("/task/add", new TaskAddCommand(taskDao, projectDao, memberDao));
    commandMap.put("/task/list", new TaskListCommand(taskDao, memberDao));
    commandMap.put("/task/detail", new TaskDetailCommand(taskDao));
    commandMap.put("/task/update", new TaskUpdateCommand(taskDao, projectDao, memberDao));
    commandMap.put("/task/delete", new TaskDeleteCommand(taskDao));

    commandMap.put("/hello", new HelloCommand());
    
    commandMap.put("/login", new LoginCommand(memberDao));
    commandMap.put("/whoami", new WhoamiCommand());
    commandMap.put("/loginout", new LoginoutCommand());
    
    context.put("commandMap", commandMap);
    
    CommandFilterManager filterManager = new CommandFilterManager();
    //filterManager.add(new AuthCommandFilter());
    filterManager.add(new DefaultCommandFilter());
    

    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();
    
    PrintWriter out = new PrintWriter(new FileWriter("command.log"));

    loop:
      while (true) {
        String inputStr = Prompt.inputString("명령> ");

        if (inputStr.length() == 0) {
          continue;
        }
        
        commandStack.push(inputStr);
        commandQueue.offer(inputStr);
              

        switch (inputStr) {
          case "history": printCommandHistory(commandStack.iterator()); break;
          case "history2": printCommandHistory(commandQueue.iterator()); break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
        	  out.println(inputStr);
        	  
        	  Request request = new Request(inputStr, context);
        	  filterManager.reset();
        	  filterManager.doFilter(request);
        	  
        }
        System.out.println();
      }

    Prompt.close();
    out.close();

    notifyApplicationContextListenerOnServiceStopped();
  }

  void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        count++;

        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
  

}
