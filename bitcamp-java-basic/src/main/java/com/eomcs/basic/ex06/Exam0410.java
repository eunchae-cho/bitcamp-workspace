package com.eomcs.basic.ex06;
// 흐름 제어문 - for문

public class Exam0410 {
  public static void main(String[] args) {
    // for(변수선언 및 초기화; 조건; 증감문) {문장;}


    for(int i = 0; i < 5 ;i++) {
      System.out.print("=> ");
      System.out.println(i);
    }

    System.out.println("--------------------");

    for (int i = 0; i < 3; i++) {
      System.out.print("=> ");
      System.out.println(i);
    }

    for (int i = 1, j = 2; i<= 10; i += 2, j += 2) {
      System.out.printf("=> %d, %d\n",i,j);
    }

  }
}
