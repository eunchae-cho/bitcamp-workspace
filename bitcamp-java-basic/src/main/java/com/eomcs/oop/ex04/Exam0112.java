package com.eomcs.oop.ex04;

public class Exam0112 {
  public static void main(String[] args) throws Exception {

    byte[] bytes = {
        (byte)0xb0, (byte)0xa1,
        (byte)0xb0, (byte)0xa2,
        (byte)0xb6, (byte)0xca,
        (byte)0xb6, (byte)0xcb
    };

    String s1 = new String(bytes);
    System.out.println(s1);

// 문자가 깨지는 이유
    // 유니코드 문자열은 OS마다 기본으로 사용하는 문자 코드표가 다르다
    // window는 MS949, linux/unix/macOS는 UTF-8
    // 위 예제의 바이트 배열은 EUC-KR
    // 따라서 String 클래스는 바이트 배열을 제대로 해석하지 못한 것이다.


    // String 클래스의 생성자를 호출할 때
    // 바이트 배열과 인코딩 정보를 함게 받는 생성자를 사용한다.
    String s2 = new String(bytes,"EUC-KR");
    System.out.println(s2);

  }
}
