package com.eomcs.oop.ex03;

public class Exam0750 {

  static class A {
    int a;
    int b;
    int c;

    // 여러개의 인스턴스 초기화 블록이 있을 때
    // 선언된 순서대로 생성자의 앞 부분에 삽입된다.
    // 인스턴스 초기화 블록이 선언된 위치는 상관없다.

    {
      this.a = 101;
      System.out.println("첫 번째 인스턴스 초기화 블록");
    }

    A() {
      // 인스턴스 초기화 블록은 위치에 상관없이 선언된 순서대로 삽입한다.

      System.out.println("A()");
      b = 200;
      c = 300;
    }

    {
      this.a = 102;
      System.out.println("두 번째 인스턴스 초기화 블록");
    }

    {
      this.a = 103;
      System.out.println("세 번째 인스턴스 초기화 블록");
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n",obj1.a,obj1.b,obj1.c);
  }
}
