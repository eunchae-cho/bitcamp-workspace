package com.eomcs.corelib.ex01;
// hashCode()

public class Exam0140_test {

  static class My {
    String name;
    int age;
  }

  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;

    // Object에서 상속 받은 hashCode()는 인스턴스마다 고유의 4바이트 정수 값을
    // 리턴한다 => 이 값은 toString()의 출력 값으로 사용된다.
    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj1);
    System.out.println(obj2);
  }

  // hash value?
  // 데이터를 다른 데이터와 구분하기 위해 사용하는 특별한 정수 값
  // 자체의 고유 번호
  // 본인 여부를 확인하는 인증서
  // 파일의 위변조를 검사하는 용도

}
