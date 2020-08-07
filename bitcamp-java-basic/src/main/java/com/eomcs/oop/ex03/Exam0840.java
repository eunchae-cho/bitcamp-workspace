package com.eomcs.oop.ex03;

public class Exam0840 {

  static class A {

    int b = 200;
    int c;
    // 인스턴스 필드 초기화 문장은
    // 선언된 순서대로 모든 생성자 앞 부분에 삽입된다.

    public A() {
      c = 300;
    }

    int a= 100;
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n",obj1.a,obj1.b,obj1.c);
  }
}
