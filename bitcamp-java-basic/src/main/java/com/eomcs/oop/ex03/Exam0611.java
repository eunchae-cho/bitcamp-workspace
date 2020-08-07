package com.eomcs.oop.ex03;

public class Exam0611 {

  public static class A {
    static int a;

    static void m() {}
    //클래스가 로딩될 때 스태틱 초기화 블록 실행

    static {
      System.out.println("Static{} 11111");
    }

    static {
      System.out.println("Static{} 22222");
    }
  }

  public static void main(String[] args) throws Exception{
    // 레퍼런스를 선언할 때에는 클래스가 로딩되지 않는다.
    A obj1;
    A obj2;

    System.out.println("종료");
  }


}
