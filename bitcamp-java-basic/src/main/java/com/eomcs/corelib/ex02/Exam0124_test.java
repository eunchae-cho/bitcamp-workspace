package com.eomcs.corelib.ex02;

public class Exam0124_test {

  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    System.out.println(b1 == b2);
    System.out.println(b1.equals(b2));

    // StringBuffer는 equals()가 오버라이딩되지 않음
    // 따로 해줘야함

  }

}
