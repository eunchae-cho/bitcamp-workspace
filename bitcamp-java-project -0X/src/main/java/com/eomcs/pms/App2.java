package com.eomcs.pms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {

    class Project{
      int number;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String personName;
      String members;
    }

    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    //new java.io.DataInputStream(System.in);

    final int LENGTH = 100;
    Project[] project = new Project[LENGTH];
    int count = 0;

    System.out.println("[프로젝트]\n");

    for(int i = 0; i < LENGTH; i++) {
      count++;

      Project p = new Project();

      System.out.print("번호? ");
      p.number = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      p.title = keyInput.nextLine()
          ;
      System.out.print("내용? ");
      p.content = keyInput.nextLine();

      System.out.print("시작일? ");
      p.startDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      p.endDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      p.personName = keyInput.nextLine();

      System.out.print("팀원? ");
      p.members = keyInput.nextLine();

      project[i] = p;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }


    keyInput.close();

    System.out.println("-----------------------------");

    for (int i = 0; i < count; i++) {
      Project p = project[i];
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          p.number,p.title,p.content,p.startDate,p.endDate,p.personName,p.members);

    }
  }
}
