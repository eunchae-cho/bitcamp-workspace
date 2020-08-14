package com.eomcs.corelib.ex02;

public class Exam0122_test {

  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);
    System.out.println(m1 == m2);

    // overriding을 하지 않았기 때문에 false
    // 인스턴스 주소를 비교
    System.out.println(m1.equals(m2));
  }

}
