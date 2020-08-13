package com.eomcs.corelib.ex01;
// Object 클래스 - 자바 최상위 클래스

public class Exam0110_test /*extends Object*/ {

  static class My /*extends Object*/ {

  }

  public static void main(String[] args) {
    Object obj = new My();

    System.out.println(obj instanceof My);
    System.out.println(obj instanceof Object);

    System.out.println(obj.toString());
    System.out.println(obj.hashCode());
    System.out.println(obj.equals("Hello"));
  }



}
