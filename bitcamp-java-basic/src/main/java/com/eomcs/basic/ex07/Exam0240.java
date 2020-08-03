package com.eomcs.basic.ex07;
// 메서드 : 개념 및 기본 문법 IV

public class Exam0240 {
  static String hello(String name, int age) {
    String retVal = String.format("%d살 %s님을 환영합니다",age,name);
    return retVal;
  }

  public static void main(String[] args) {
    String r = hello("홍길동",20);
    System.out.println(r);

    r = hello("임꺽정",30);
    System.out.println(r);
  }
}
