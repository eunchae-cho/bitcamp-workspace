package com.eomcs.basic.ex05;
// 산술연산자 - 우선순위

public class Exam0120_test {
  public static void main(String[] args) {
    // *,/,% 먼저
    System.out.println(2 + 3 * 7);
    System.out.println(3 * 7 + 2);
    
    //같은 우선순위에서는 먼저 나온 값
    System.out.println(3 * 8 / 2);
    System.out.println(8 / 2 * 3);
    
    //괄호 먼저
    System.out.println((2 + 3) * 7);
    
  }
}
