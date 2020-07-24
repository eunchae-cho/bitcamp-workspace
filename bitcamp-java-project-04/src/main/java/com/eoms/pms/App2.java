package com.eoms.pms;

public class App2 {

  public static void main(String[] args) {
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    //new java.io.DataInputStream(System.in);


    
    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");
    System.out.println();

    System.out.print("번호? ");
    int number = keyInput.nextInt();
    keyInput.nextLine();
    
    System.out.print("프로젝트명? ");
    String title = keyInput.nextLine()
        ;
    System.out.print("내용? ");
    String content = keyInput.nextLine(); 
    
    
    System.out.print("시작일? ");
    java.sql.Date startDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.print("종료일? ");
    java.sql.Date endDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.print("만든이? ");
    String PersonName = keyInput.nextLine();
    System.out.print("팀원? ");
    String members = keyInput.nextLine();
    
    System.out.println("-----------------------------");
    
    System.out.println("번호: "+number);
    System.out.println("프로젝트명: "+title);
    System.out.println("내용: "+content);
    System.out.println("시작일: "+startDate);
    System.out.println("종료일: "+endDate);
    System.out.println("만든이; "+PersonName);
    System.out.println("팀원: "+members);
  }
}
