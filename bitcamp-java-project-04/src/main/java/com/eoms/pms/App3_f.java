package com.eoms.pms;


import java.util.Scanner;

public class App3_f {
  
  public static void main(String[] args) {
    
  
    Scanner sc = new Scanner(System.in);
    final int MAX_LENGHT = 5;
    String[] title = new String[MAX_LENGHT];
    int[] num = new int[MAX_LENGHT];
    String[] content = new String[MAX_LENGHT];
    String[] date = new String[MAX_LENGHT];
    String[] status = new String[MAX_LENGHT];
    String[] manager = new String[MAX_LENGHT];
    
    System.out.println("[ 작업 ]");
    System.out.println();
    
    int count = 0;
    
    for (int i = 0; i < MAX_LENGHT; i++) {
      count++;
      
      System.out.print("프로젝트? ");
      title[i] = sc.nextLine();
      
      System.out.print("번호? ");
      num[i] = sc.nextInt();
      sc.nextLine();
      
      System.out.print("내용? ");
      content[i] = sc.nextLine();
      
      System.out.print("종료일? ");
      date[i] = sc.nextLine();
      
      System.out.print("상태? ");
      status[i] = sc.nextLine();
      
      System.out.print("담당자? ");
      manager[i] = sc.nextLine();
      System.out.println();
      
      System.out.print("계속 하시겠습니까?(y/n) ");
      String response = sc.nextLine();
      System.out.println();
      
      if(response.equalsIgnoreCase("y") == false) {
        break;
      }
    }
    sc.close();
    
    System.out.println("-------------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("(%s, %d, %s, %s, %s, %s)\n",
          title[i],num[i],content[i],date[i],status[i],manager[i]);
    }
  
  }
}
