package com.eomcs.oop.ex04;

public class Exam0220 {
  public static void main(String[] args) throws Exception {
    // Integer i1 = new Integer(100);  이렇게 생성자를 통해서
    // Integer 객체를 생성할 수 있지만 이 생성자는 사용하지 말라고
    // 권고한 것이기 때문에 가능한 개발 중에 사용하자 말 것

    // 대신에 Integer 인스턴스를 생성하라
    Integer i1 = Integer.valueOf(100);
    Integer i2 = Integer.valueOf(200);
    Integer i3 = Integer.valueOf(300);

    // 인스턴스 메서드 사용
    System.out.println(i2.compareTo(i1)); // 1
    System.out.println(i2.compareTo(i3)); // -1

    int v1 = i2.intValue();
    System.out.println(v1);

    int v2 = Integer.parseInt("1280");

  }

}
