package com.eomcs.basic.ex06;
// 흐름 제어문 - if ~ else문

public class Exam0140 {
  public static void main(String[] args) {
    int age = 17;

    if (age < 19)
      System.out.println("미성년자입니다.");

    if (age >= 19)
      System.out.println("성인입니다.");
    else
      System.out.println("미성년자입니다.");

    if(age >= 20) {
      System.out.println("------------");
      System.out.println("성인닙니다.");
    }
    else {
      System.out.println("------------");
      System.out.println("미성년자입니다.");
    }

    if (age >= 19) {
      System.out.println("성인입니다.");
      System.out.println("------------");
    }
    else
      System.out.println("미성년자입니다.");

    if (age >= 19) {
      System.out.println("성인입니다.");
    }
    else {
      System.out.println("미성년자입니다.");
      System.out.println("-------------");
    }
  }

}
