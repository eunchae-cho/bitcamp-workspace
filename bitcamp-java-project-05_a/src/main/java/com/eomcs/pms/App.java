package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 회원 데이터를 입력하는 코드를 메서드로 분리한다
// 2) 회원 데이터 목록을 출력하는 코드를 메서드로 분리한다
// 3) 프로젝트 데이터 목록을 입력하는 코드를 메서드로 분리한다
// 4) 프로젝트 데이터 목록을 출력하는 코드를 메서드로 분리한다
// 5) 작업 데이터 목록을 입력하는 코드롤 메서드로 분리한다
// 6) 작업 데이터 목록을 출력하는 코드를 메서드로 분리한다
// 7) 사용자로부터 입력 받는 코드를 메서드로 분리한다 +prompt
// 8) prompt()를 목적에 따라 더 세분화하여 분리한다


public class App {

  static Scanner keyInput = new Scanner(System.in);

  // 회원
  static final int LENGTH = 5;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] now = new Date[LENGTH];

  static int count = 0;

  // 프로젝트
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];

  static int pcount = 0;

  // 작업
  static final int TLENGTH = 100;

  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tcompletedDate = new Date[TLENGTH];
  static String[] tstate = new String[TLENGTH];
  static String[] tworker = new String[TLENGTH];

  static int tcount = 0;


  public static void main(String[] args) {


    loop:
    while (true) {

      String command = promptString("명령> ");

      switch (command.toLowerCase()) {
        case "/member/add":
          addMember();    // 메소드 호출
          break;
        case "/member/list":
          listMember();
          break;
        case "/project/add":
          addProject();
          break;
        case "/project/list":
          listProject();
          break;
        case "/task/add":
          addTask();
          break;
        case "/task/list":
          listTask();
            break;
        case "exit":
        case "quit":
          System.out.println("안녕!");
          break loop;
        default:
          System.out.println("실행할 수 없는 명령입니다.");
      }

      System.out.println();
    }

    keyInput.close();
    System.out.println("종료");

  }





  static void addMember() {
    System.out.println("[회원 등록]");

    no[count] = promptInt("번호? ");  // replace temp with Query

    name[count] = promptString("이름? ");
    email[count] = promptString("이메일? ");
    password[count] = promptString("암호? ");
    photo[count] = promptString("사진? ");
    tel[count] = promptString("전화? ");
    now[count] = new Date(System.currentTimeMillis());

    count++;

  }



  static void listMember() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s,  %s, %s\n",
          no[i], name[i], email[i], password[i], photo[i], tel[i], now[i].toString());
    }
  }





  static void addProject() {
    System.out.println("[회원 프로젝트]");

    pno[pcount] = promptInt("번호?");
    ptitle[pcount] = promptString("프로젝트명? ");
    pcontent[pcount] = promptString("내용? ");
    pstartDate[pcount] = promptDate("시작일?");
    pendDate[pcount] = promptDate("종료일? ");
    powner[pcount] = promptString("만든이? ");
    pmembers[pcount] = promptString("팀원? ");

    pcount++;
  }



  static void listProject() {
    System.out.println("[회원 프로젝트 목록]");

    for (int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          pno[i], ptitle[i], pcontent[i], pstartDate[i], pendDate[i], powner[i], pmembers[i]);
    }
  }



  static void addTask() {
    System.out.println("[작업]");

    tno[tcount] = promptInt("번호? ");
    tcontent[tcount] = promptString("내용? ");
    tcompletedDate[tcount] =promptDate("완료일? ");
    tstate[tcount] = promptString("상태? \n 0: 신규\n 1: 진행중\n 2: 완료\n> ");
    tworker[tcount] = promptString("담당자? ");

    tcount++;
  }





  static void listTask() {
    for (int i = 0; i < tcount; i++) {
      String stateTitle;
      switch (tstate[i]) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
        default:
          stateTitle = "완료";
      }

      System.out.printf("%d, %s, %s, %s, %s\n",
          tno[i], tcontent[i], tcompletedDate[i], stateTitle, tworker[i]);
    }
  }




  static String promptString(String title) {  // title = "명령> "
    System.out.print(title);
    return keyInput.nextLine();
                        // return으로 값을 돌아간다면 메소드 선언이
                        // void가 아니라 String과 같은 값에 따른 데이터 타입이 되야 한다.
  }

  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }


  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }



}









