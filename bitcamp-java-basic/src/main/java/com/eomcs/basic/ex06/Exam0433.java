package com.eomcs.basic.ex06;
// for 중첩과 break

public class Exam0433 {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++) {
      for(int j = 1; j <= i; j++) {
        if(j % 2 == 0)
          continue;
        System.out.println(j+" ");
      }
      System.out.println();
    }
  }
}
