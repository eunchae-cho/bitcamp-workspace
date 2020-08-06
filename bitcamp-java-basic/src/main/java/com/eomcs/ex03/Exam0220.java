package com.eomcs.ex03;

public class Exam0220 {
  static class A {
    int value;

    static void m1() {

    }

    void m2() {
      this.value = 100;
    }

    void m3() {
      value = 200;
    }

    void m4(int value) {
      value = 200;
      this.value = 300;
    }

  }

  public static void main(String[] args) {

    int value = 0;

    A.m1();

    A obj1 = new A();
    obj1.m2();
    obj1.m3();
    obj1.m4(value);
  }

}
