package com.eomcs.basic.ex05;
// 비트 연산지 &를 이용하여 % 연산 구현하기 응용 I

public class Exam0352_test {
  public static void main(String[] args) {
    
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");
    System.out.println((57 & 0b1) == 0 ? "짝수" : "홀수");
    System.out.println((57 & 0x1) == 0 ? "짝수" : "홀수");
    
  }
}
