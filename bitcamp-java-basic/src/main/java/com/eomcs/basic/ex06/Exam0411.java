package com.eomcs.basic.ex06;
// for 반복문

public class Exam0411 {
  public static void main(String[] args) {
    int i = 1;
    for(; i<= 5;) {
      System.out.println(i);
      i++;
    }

    for(; i<= 5;) {
      i++;
      System.out.println(i);
    }
  }
}
