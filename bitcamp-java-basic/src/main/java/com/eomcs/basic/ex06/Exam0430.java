package com.eomcs.basic.ex06;
// for 중첩과 break

public class Exam0430 {
  public static void main(String[] args) {

    loop:
    for(int i = 1; i <= 9; i++) {
      for(int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n",i,j,i*j);
        if(i == 5 && j == 5) {
          continue loop;
        }
      }
      System.out.println("-------------");
    }
  }
}
