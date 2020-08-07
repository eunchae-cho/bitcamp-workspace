package com.eomcs.oop.ex03;

public class Exam0680 {
  public static class A {
    static int a;
    static {
      a = 100;
    }
    static {
      a = 200;
      System.out.println("static {} 실행");
    }

    static {
      b = 400;
    }
    static int b = 300;

    // 변수 초기화 문장을 컴파일할 때
    // 일단 모든 스태틱 필드를 먼저 만든다.
    // 스태틱 변수 초기화 문장을 스태틱 블록으로 변경한 다음에
    // 모든 스태틱 블록을 순서대로 한 스태틱 블록에 합친다.
    // 스태틱 변수 초기화 문장과 스태틱 블록을 선언한 순서대로
    // 하나의 스태틱 블록에 합친다.

//    이와 같이 순서 정리!
//    static int a;
//
//
//    static {
//      a = 100;
//      a = 200;
//      b = 400;
//      b = 300;
//    }


  }

  public static void main(String[] args) {
    System.out.println(A.a );
    System.out.println(A.b );
  }
}

