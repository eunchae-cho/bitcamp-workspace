package com.eomcs.corelib.ex02;

public class Exam0130_test {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1.hashCode() == s2.hashCode());

    //Object의 hasCode()는 인스턴스 마다 다르다
    // 그러나 String의 hashCode()는
    // 문자열이 같으면 같은 hashCode()를 리턴하도록 오버라이딩 했다
  }
}
