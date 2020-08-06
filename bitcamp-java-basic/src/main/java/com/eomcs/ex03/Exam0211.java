package com.eomcs.ex03;

public class Exam0211 {

  static class A {

    static void m1() {
      System.out.println("m1()");
    }

    void m2() {
      System.out.println("m2()");
    }
  }

  public static void main(String[] args) {

    A.m1();

    A obj1 = new A();

    obj1.m1(); // no

    obj1.m2();

    A obj2 = null;
    obj2.m2();
  }
}
