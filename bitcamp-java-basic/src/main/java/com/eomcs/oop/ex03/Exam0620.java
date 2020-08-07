package com.eomcs.oop.ex03;
// static initializer
// how to use class field

import com.eomcs.oop.ex03.Exam0611.A;

public class Exam0620 {
  static int a;

  static void m() {
    // 여러 개의 스태틱 블록이 있을 때 컴파일러는 한 개의 블록으로 합친다.

  }
  static {
    System.out.println("Static{} 11111");
  }
  static {
    System.out.println("Static{} 22222");
  }


  public static void main(String[] args) {
    // 클래스 멤버인 필드를 최초르 사용할 때
    A.a = 100;
    System.out.println("종료");
  }
}
