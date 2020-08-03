package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 명령 프롬프트를 출력한다.
// 2) 명령어를 입력 받아 출력한다.
// 3) 명령어를 입력 받는 것을 반복한다.
// 4) `/member/add`, `/member/list` 명령을 구분한다.
// 5) `/member/add` 명령을 처리한다.
// 6) `/member/list` 명령을 처리한다.
// 7) `/project/add` 명령을 처리한다.
// 8) `/project/list` 명령을 처리한다.
// 9) `/task/add` 명령을 처리한다.
// 10) `/task/list` 명령을 처리한다
public class App_b {

  static Scanner keyboardScan = new Scanner(System.in);

  // 회원 데이터
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];

  static int size = 0;

  // 프로젝트 데이터
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];

  static int psize = 0;

  // 작업 데이터
  static final int TLENGTH = 100;

  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tdeadline = new Date[TLENGTH];
  static String[] towner = new String[TLENGTH];
  static String[] tstatus = new String[TLENGTH];

  static int tsize = 0;


  public static void main(String[] args) {


    loop:
      while (true) {

        String command = promptString("명령> ");

        switch (command) {
          case "/member/add":
            addMember();
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
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

   keyboardScan.close();

  }



  static void addMember() {
    System.out.println("[회원 등록]");

    no[size] = promptInt("번호? ");
    name[size] = promptString("이름? ");
    email[size] = promptString("이메일? ");
    password[size] = promptString("비밀번호? ");
    photo[size] = promptString("사진? ");
    tel[size] = promptString("전화? ");
    registeredDate[size] = new Date(System.currentTimeMillis());

    size++;
  }




  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          no[i], name[i], email[i], password[i], photo[i], tel[i], registeredDate[i]);
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    pno[psize] = promptInt("번호? ");
    ptitle[psize] = promptString("프로젝트명? ");
    pcontent[psize] = promptString("내용? ");
    pstartDate[psize] = promptDate("시작일? ");
    pendDate[psize] =promptDate("종료일? ");
    powner[psize] = promptString("만든이? ");
    pmembers[psize] = promptString("팀원? ");

    psize++;
  }

  static void listProject() {
    for (int i = 0; i < psize; i++) {

      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          pno[i], ptitle[i], pcontent[i], pstartDate[i], pendDate[i], powner[i], pmembers[i]);
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");

    tno[tsize] = promptInt("번호? ");
    tcontent[tsize] = promptString("내용? ");
    tdeadline[tsize] = promptDate("마감일? ");
    tstatus[tsize] = promptString("상태? \n0: 신규 \n1: 진행중 \n2: 완료\n> ");
    towner[tsize] = promptString("담당자? ");

    tsize++;
    }

  static void listTask() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tsize; i++) {
      String stateLabel = null;
      switch (tstatus[i]) {
        case "1":
          stateLabel = "진행중";
          break;
        case "2":
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
    }
  }

  static String promptString(String title) {
   System.out.print(title);
   return keyboardScan.nextLine();
  }

  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }


  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));

 }
}
