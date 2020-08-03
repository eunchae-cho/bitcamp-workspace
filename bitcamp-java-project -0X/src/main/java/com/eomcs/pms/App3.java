package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {

    class Task {
      int number;
      String content;
      Date endDate;
      String status;
      String manager;
    }

    java.util.Scanner keyInput = new java.util.Scanner(System.in);


    final int LENGTH = 10;
    Task[] task = new Task[LENGTH];
    int count = 0;

    System.out.println("[작업]\n");

    System.out.print("프로젝트?");
    String title = keyInput.nextLine();
    System.out.println();


    for (int i = 0; i < LENGTH; i++) {
      count++;
      Task t = new Task();

      System.out.print("번호? ");
      t.number = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      t.content = keyInput.nextLine();

      System.out.print("완료일? ");
      t.endDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      t.status = keyInput.nextLine();


      System.out.print("담당자? ");
      t.manager = keyInput.nextLine();

      task[i] = t;

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
      Task t = task[i];

      switch (t.status) {
        case "0":
          t.status = "신규";
          break;
        case "1":
          t.status = "진행중";
          break;
        case "2":
          t.status = "완료";
          break;
          }
      System.out.printf("%d, %s, %s, %s, %s\n",
        t.number,t.content,t.endDate,t.status,t.manager);
    }
  }

}

