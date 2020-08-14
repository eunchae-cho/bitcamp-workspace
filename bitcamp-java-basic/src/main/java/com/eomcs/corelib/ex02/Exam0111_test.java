package com.eomcs.corelib.ex02;

public class Exam0111_test {

  public static void main(String[] args) {
    // 문자열 리터럴
    // string constant pool에 인스턴스 생성
    // 내용이 같으면 기존 인스턴스 주소 리턴
    // 메모리 절약
    //JVM이 끝날 때까지 메모리 유지

    String x1 = "Hello";
    String x2 = "Hello";

    System.out.println(x1 == x2);
  }

}
