package com.eomcs.oop.ex03;

public class Exam0710 {

  static class A {
    int a;
    int b;
    int c;

    // 인스턴스 초기화 블록 사용 후
    // 여러 생성자에 공통으로 존재하는 코드가 있다면
    // 별도의 블록으로 뽑아내는 것이 소스 코드 관리에 좋다
    // 이럴 때 사용하라고 만든 문법이 인스턴스 블록이다
    // 다음과 같이 인스턴스 초기화 블록을 사용하여 생산자에
    // 공통으로 들어갈 코드를 작성하면 된다

    {
      a = 100;
      System.out.println("Hello");
    }

  }


  public static void main(String[] args) {
      A obj1 = new A();
      System.out.printf("a=%d, b=%d, c=%d\n", obj1.a,obj1.b,obj1.c);
  }

}
