package com.eomcs.corelib.ex02;

public class Exam0160_test {
  public static void main(String[] args) {
    // String 객체는 immutable객체이다
    // 값을 한 번 담으면 변경할 수 없다.

    String s1 = new String("Hello");

    // String 클래스 메서드는 원본 인스턴스의 데이터를 변경하지 않는다

    String s2 = s1.replace('l','x');
    System.out.printf("%s : %s\n", s1,s2);

    String s3 = s1.concat(", world!");
    System.out.printf("%s : %s\n", s1,s3);

  }

}
