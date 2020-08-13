package com.eomcs.corelib.ex01;

public class Exam0132_test {

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
    System.out.println(m1.equals(m2));
    System.out.println("--------------------");

    String s1 = new String("hello");
    String s2 = new String("hello");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    // Member 객체에 대해서도 인스턴스가 다르더라도
    // 데이터가 같으면 true를 리턴하고 싶은가
    // String 클래스 처럼 toString()을 오버라이딩 해라

  }

}
