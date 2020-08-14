package com.eomcs.corelib.ex02;

public class Exam0114_test {

  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = "Hello";

    // heap에 만들어진 새로운 객체를 버리고
    // 상수풀에 이 객체를 하나 만들어 버리자
    // 이 새로운 객체와 같은 객체가 상수풀에 있다면
    // 그 값을 갖자
    String s3 = s1.intern();

    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
  }

}
