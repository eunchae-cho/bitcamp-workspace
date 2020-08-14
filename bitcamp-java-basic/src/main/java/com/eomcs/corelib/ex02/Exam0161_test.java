package com.eomcs.corelib.ex02;

public class Exam0161_test {
  public static void main(String[] args) {
    // StringBuffer 객체는 mutable 객체이다
    // 인스턴스의 데이터를 변경할 수 있다.

    StringBuffer buf = new StringBuffer("Hello");
    System.out.println(buf);

    buf.replace(0, 1, "xxxx");
    System.out.println(buf);
  }
}
