package com.eomcs.corelib.ex02;

public class Exam0125_test {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    System.out.println(b1.toString());
    System.out.println(b2.toString());
    System.out.println(b1.toString().equals(b2.toString()));

    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());
    System.out.println(b1.hashCode() == b2.hashCode());

  }

}
