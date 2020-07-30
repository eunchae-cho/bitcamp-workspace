package com.eomcs.basic.ex06;
// 흐름 제어문 - if 여러 문장 묶기

public class Exam0120 {
  public static void main(String[] args) {
    int age = 17;

    if (age >= 19)
      System.out.println("성인이다.");
      System.out.println("군대에 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");

    System.out.println("-------------------------");

    if (age >= 19) {
      System.out.println("성인이다.");
      System.out.println("군대에 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");
    }
  }
}
