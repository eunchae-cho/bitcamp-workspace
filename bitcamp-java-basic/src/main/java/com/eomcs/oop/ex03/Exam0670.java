package com.eomcs.oop.ex03;
// 스태틱 초기화 블록

public class Exam0670 {

  public static class A {
    static int a = 100;

    // 스태틱 초기화 블록이 없으면 컴파일러가 자동으로 삽입
    // 스태틱 초기화 블록에 a에 100을 할당하는 문장을 삽입
    // static int a;
    // static {
    // a = 100;
    // }

    public static void main(String[] args) {
      System.out.println(A.a);
    }
  }
}
