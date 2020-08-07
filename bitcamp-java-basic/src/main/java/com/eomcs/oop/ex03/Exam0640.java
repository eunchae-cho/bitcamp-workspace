package com.eomcs.oop.ex03;
// 인스턴스 생성

public class Exam0640 {

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
    // 해달 클래스의 인스턴스를 최소로 생성할 때
    // - 인스턴스 만드려면 셀계도가 있어야 하고
    // - 설계도는 메모리에 로딩이 되어야 한다.
    // - 설계도가 없으면 즉시 설계도를 로딩해야 한다.

    new A();
    System.out.println("종료");
  }
}
