package com.eomcs.ex03;

public class Exam0110 {
  public static void main(String[] args) {

    //인스턴스 변수
    class A {
      int v1;
      boolean v2;
    }

    // 객체 레퍼런스
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;


  }
}
