package com.eomcs.oop.ex03;

public class Exam0860 {

  static class A{
    // 문법을 헷갈리지 않도록 하기 위해서 가능한 다음 순서로 코드를 작성하라
    // 필드 선언 및 초기화 문장
    // 스태틱 블록 - 가능한 한 개의 블록으로
    // 인스턴트 블록 - 가능한 한 개의 블록으로
    // 생성자

    // 필드 선언 및 초기화 문장
    int a = 100;

    {
      this.a = 200;
      System.out.println("초기화 블록");
    }

    A() {
      System.out.println("A()");
    }

    A(int a) {
      System.out.println("A(int)");
      this.a = a;
    }

  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println(obj1.a);
    System.out.println("-------------------");

    A obj2 = new A(1111);
    System.out.println(obj2.a);
  }
}
