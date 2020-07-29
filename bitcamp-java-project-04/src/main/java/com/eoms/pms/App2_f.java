package com.eoms.pms;



import java.util.Scanner;



public class App2_f {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    final int MAX_LENGTH = 5;
    int[] num = new int[MAX_LENGTH];
    String[] title = new String[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    String[] start = new String[MAX_LENGTH];
    String[] end = new String[MAX_LENGTH];
    String[] person = new String[MAX_LENGTH];
    String[] members = new String[MAX_LENGTH];
    
    System.out.println("[ 프로젝트 ]");
    System.out.println();
    
   
    int count = 0;
    
    for (int i = 1; i < MAX_LENGTH; i++) {
      count++; 
      
      System.out.print("번호? ");
      num[i] = sc.nextInt();
      sc.nextLine();
      
      System.out.print("프로젝트명? ");
      title[i] = sc.nextLine();
      
      System.out.print("내용? ");
      content[i] = sc.nextLine();
      
      System.out.print("시작일? ");
      start[i] = sc.nextLine();
      
      System.out.print("종료일? ");
      end[i] = sc.nextLine();
      
      System.out.print("만든이? ");
      person[i] = sc.nextLine();
      
      System.out.print("팀원? ");
      members[i] = sc.nextLine();
      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(y/n) ");
      String response = sc.nextLine();
      System.out.println();
      
      if(response.equalsIgnoreCase("y") == false) {
        break;
      }
    
      }
    sc.close();
    
    System.out.println("---------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("(%d / %s / %s / %s/ %s / %s)\n",
          num[i],title[i],content[i],start[i],end[i],person[i],members[i]);
    }
    
  }
  
}
