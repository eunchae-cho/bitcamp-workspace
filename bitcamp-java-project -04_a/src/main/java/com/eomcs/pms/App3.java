package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {

    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    final int LENGTH = 1000;
    int[] number = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] endDate = new Date[LENGTH];
    int[] status = new int[LENGTH];
    String[] manager = new String[LENGTH];
    int count = 0;

    System.out.println("[작업]\n");

    System.out.print("프로젝트?");
    String title = keyInput.nextLine();
    System.out.println();


    for (int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("번호? ");
      number[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      endDate[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      status[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("담당자? ");
      manager[i] = keyInput.nextLine();

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }

    keyInput.close();

    System.out.println("---------------------");

    System.out.println("[프로젝트"+title+"]");
    for(int i = 0; i < count; i++) {
      switch (status[i]) {
        case 0:
          System.out.println("신규");
          break;
        case 1:
          System.out.println("진행중");
          break;
        case 2:
          System.out.println("완료");
          break;
      }
      System.out.printf("%d, %s, %s, %d, %s\n",
          number[i],content[i],endDate[i],status[i],manager[i]);
    }

  }
}
