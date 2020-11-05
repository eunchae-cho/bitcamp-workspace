package com.eomcs.pms;

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
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.dao.mariadb.BoardDaoImpl;
import com.eomcs.pms.dao.mariadb.MemberDaoImpl;
import com.eomcs.pms.dao.mariadb.ProjectDaoImpl;
import com.eomcs.pms.dao.mariadb.TaskDaoImpl;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.LoginCommand;
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
import com.eomcs.pms.handler.TaskAddCommand;
import com.eomcs.pms.handler.TaskDeleteCommand;
import com.eomcs.pms.handler.TaskDetailCommand;
import com.eomcs.pms.handler.TaskListCommand;
import com.eomcs.pms.handler.TaskUpdateCommand;
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

    BoardDaoImpl baordDao = new BoardDaoImpl(con);
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

    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();

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
            Command command = commandMap.get(inputStr);
            if (command != null) {
              try {
                // 실행 중 오류가 발생할 수 있는 코드는 try 블록 안에 둔다.
                command.execute(context);
              } catch (Exception e) {
                // 오류가 발생하면 그 정보를 갖고 있는 객체의 클래스 이름을 출력한다.
                System.out.println("--------------------------------------------------------------");
                System.out.printf("명령어 실행 중 오류 발생: %s\n", e);
                System.out.println("--------------------------------------------------------------");
              }
            } else {
              System.out.println("실행할 수 없는 명령입니다.");
            }
        }
        System.out.println();
      }

    Prompt.close();

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
