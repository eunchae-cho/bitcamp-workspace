package com.eoms.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
        
    System.out.println("[작업]");
    System.out.println();
    
    System.out.print("프로젝트? ");
    String title = keyInput.nextLine();
    
    System.out.print("번호? ");
    String str = keyInput.nextLine();
    int number = Integer.parseInt(str);
    
    System.out.print("내용? ");
    String content = keyInput.nextLine();
    
    System.out.print("완료일? ");
    java.sql.Date endDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    String status = keyInput.nextLine();
    System.out.print("담당자? ");
    String manager = keyInput.nextLine();
    
    keyInput.close();
    
    System.out.println("---------------------");
    
    System.out.println("프로젝트: "+title);
    System.out.println("번호: "+number);
    System.out.println("내용: "+content);
    System.out.println("완료일: "+endDate.toString());
    //if(status.equals("0")) {
     // System.out.println("상태: 신규");
    //}else if(status.equals("1")) {
     // System.out.println("상태: 진행중");
    //}else if(status.equals("2")) {
     // System.out.println("상태: 완료");
    //}
    switch (status) {
      case "0":
        System.out.println("상태: 신규");
        break;
      case "1":
        System.out.println("상태: 진행중");
        break;
      case "2":
        System.out.println("상태: 완료");
        break;
    }
    
    System.out.println("담당자: "+manager);
    

  }
}
