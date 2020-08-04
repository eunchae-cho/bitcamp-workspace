package com.eomcs.basic.ex07;
// JVM argument

public class Exam0610 {

  public static void main(String[] args) {


    // JVM argument의 값 꺼내가
    String value1 = System.getProperty("a");
    String value2 = System.getProperty("b");
    String value3 = System.getProperty("c");

    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
  }


}
