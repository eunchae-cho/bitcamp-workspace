package com.eomcs.corelib.ex02;

public class Exam0110_test {
  public static void main(String[] args) {
    // String
    // 레퍼런스
    // 클래스
    // 자바 기본 타입이 아니다

    // 인스턴스 주소를 담는 레퍼런스이다.
    String s1;

    s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2);

  }

}
