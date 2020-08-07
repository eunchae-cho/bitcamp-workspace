package com.eomcs.oop.ex03;
// 스태틱 초기화 블록

import com.eomcs.oop.ex03.Exam0611.A;

public class Exam0630 {
  static int a;
  static void m() {}

  static {
    System.out.println("Static{} 11111");
  }
  static {
    System.out.println("Static{} 22222");
  }

  public static void main(String[] args) {
    // 클래스 멤버인 메소드를 최최로 사용할 때
    A.m();
    System.out.println("종료");
  }
}
