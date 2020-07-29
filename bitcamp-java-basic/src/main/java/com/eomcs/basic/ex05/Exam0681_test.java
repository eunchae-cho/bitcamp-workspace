package com.eomcs.basic.ex05;
// 전위 증감 연산자 응용 II

public class Exam0681_test {
  public static void main(String[] args) {
    int a = 5;
    int r = --a + --a / --a;
    System.out.printf("%d, %d",a,r);
  }
}
