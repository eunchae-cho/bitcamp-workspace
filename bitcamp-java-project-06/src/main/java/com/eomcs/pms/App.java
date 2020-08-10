package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);


    // member
    final int LENGTH = 100;
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    int size = 0;


    // project
    final int PLENGTH = 100;
    int[] pno = new int[PLENGTH];
    String[] ptitle = new String[PLENGTH];
    String[] pcontent = new String[PLENGTH];
    Date[] pstartDate = new Date[PLENGTH];
    Date[] pendDate = new Date[PLENGTH];
    String[] powner = new String[PLENGTH];
    String[] pmembers = new String[PLENGTH];

    int psize = 0;

    // task
    final int TLENGTH = 100;
    int[] tno = new int[TLENGTH];
    String[] tcontent = new String[TLENGTH];
    Date[] tdeadline = new Date[TLENGTH];
    String[] towner = new String[TLENGTH];
    int[] tstatus = new int[TLENGTH];

    int tsize = 0;


    loop:
      while (true) {

        System.out.print("명령> ");
        String command = keyboardScan.nextLine();
        System.out.println();

        switch (command.toLowerCase()) {
        case "/member/add":
            System.out.println("[회원 등록]");

            System.out.print("번호? ");
            no[size] = Integer.parseInt(keyboardScan.nextLine());

            System.out.print("이름? ");
            name[size] = keyboardScan.nextLine();

            System.out.print("이메일? ");
            email[size] = keyboardScan.nextLine();

            System.out.print("암호? ");
            password[size] = keyboardScan.nextLine();

            System.out.print("사진? ");
            photo[size] = keyboardScan.nextLine();

            System.out.print("전화? ");
            tel[size] = keyboardScan.nextLine();

            registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

            size++;
            break;

        case "/member/list":
          for (int i = 0; i < size; i++) {
          System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", // 출력 형식 지정
              no[i], name[i], password[i], photo[i], email[i], tel[i], registeredDate[i]);
          }
          break;
        case "/project/add":
          System.out.println("[프로젝트]");

          System.out.print("번호? ");
          pno[psize] = Integer.valueOf(keyboardScan.nextLine());

          System.out.print("프로젝트명? ");
          ptitle[psize] = keyboardScan.nextLine();

          System.out.print("내용? ");
          pcontent[psize] = keyboardScan.nextLine();

          System.out.print("시작일? ");
          pstartDate[psize] = Date.valueOf(keyboardScan.nextLine());

          System.out.print("종료일? ");
          pendDate[psize] = Date.valueOf(keyboardScan.nextLine());

          System.out.print("만든이? ");
          powner[psize] = keyboardScan.nextLine();

          System.out.print("팀원? ");
          pmembers[psize] = keyboardScan.nextLine();

          psize++;
          break;
        case "/project/list":

          for (int i = 0; i < psize; i++) {
            System.out.printf("%d, %s, %s, %s, %s, %s\n",
                pno[i], ptitle[i], pcontent[i], pstartDate[i], pendDate[i], powner[i]);
          }
          break;
        case "/task/add":
          System.out.println("[작업]");

          System.out.print("번호? ");
          tno[tsize] = Integer.parseInt(keyboardScan.nextLine());

          System.out.print("내용? ");
          tcontent[tsize] = keyboardScan.nextLine();

          System.out.print("마감일? ");
          tdeadline[tsize] = Date.valueOf(keyboardScan.nextLine());

          System.out.println("상태?");
          System.out.println("0: 신규");
          System.out.println("1: 진행중");
          System.out.println("2: 완료");
          System.out.print("> ");
          tstatus[tsize] = Integer.valueOf(keyboardScan.nextLine());

          System.out.print("담당자? ");
          towner[tsize] = keyboardScan.nextLine();

          tsize++;
          break;
        case "/task/list":

          for (int i = 0; i < tsize; i++) {
            String stateLabel = null;
            switch (tstatus[tsize]) {
              case 1:
                stateLabel = "진행중";
                break;
              case 2:
                stateLabel = "완료";
                break;
              default:
                stateLabel = "신규";
            }
            System.out.printf("%d, %s, %s, %s, %s\n",
                tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
          }
          break;
        case "exit":
        case "quit":
          System.out.println("종료!");
          break loop;
        default :
          System.out.println("잘못 입력하셨습니다.");

          }
        System.out.println();
        }
    keyboardScan.close();



  }
}
