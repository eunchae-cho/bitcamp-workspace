package com.eomcs.corelib.ex02;

public class Exam0121_test {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("HELLO");

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
  }
}
