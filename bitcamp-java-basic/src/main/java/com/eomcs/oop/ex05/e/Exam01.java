package com.eomcs.oop.ex05.e;

public class Exam01 {

  public static void main(String[] args) {
    B obj = new B();
    obj.v2 = 200;
    obj.v1 = 100;
    System.out.printf("v2=%d, v1=%d",obj.v2,obj.v1);

    B obj2 = new B();
    obj2.v2 = 2000;
    obj2.v1 = 1000;
    System.out.printf("v2=%d, v1=%d",obj2.v2,obj2.v1);
  }

}
