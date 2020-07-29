package com.eomcs.basic.ex05;
// 비트 이동 연산자

public class Exam0411_test {
  public static void main(String[] args) {
     
    // << 양수
    int a = -0x7f_ff_ff_fa;
    System.out.println(a);
    System.out.println(a << 1);
    System.out.println(a << 2);
    System.out.println(a << 3);
    System.out.println(a << 4);
    
    // 2제곱한 것과 비슷함
    // 12 
    // 24 = 12 * 2
    // 48 = 12 * 2^2
    // 96 = 12 * 2^3
  }
}
