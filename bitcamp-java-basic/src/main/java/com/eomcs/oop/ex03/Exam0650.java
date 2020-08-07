package com.eomcs.oop.ex03;
// Class.forName

public class Exam0650 {

  public static class A {
    static int a;

    static void m() {}

    static {
      System.out.println("Static{} 11111");
    }
    static {
      System.out.println("Static{} 22222");
    }
  }

  public static void main(String[] args) {
    // 클래스가 로딩되는 경우
    // 자바에서 제공하는 도구를 사용하여 클래스를 로딩할 때
    // 이미 클래스가 로딩되어 있다면 다시 로딩하지 않는다.
    // 메모리 절약하기 위해 자바는 중복해서 클래스를 메모리에 로딩하지 않는다

   // Class.forName("com.eomcs.oop.ex03.Exam0650$A");
    System.out.println("종료");
  }
}
