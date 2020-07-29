package com.eomcs.basic.ex05;
// 비트 이동 연산자

public class Exam0421_test {
  public static void main(String[] args) {
    
    // 음수값은 1로 
    int i = 0b11111111_11111111_11111111_10101001;
    System.out.println(i);
    
    // >> 음수
    System.out.println(i >> 1);
    System.out.println(i >> 2);
    System.out.println(i >> 3);
    System.out.println(i >> 4);
    
    // 2제곱을 나눈것과 비슷함, 다만 음수로
  }
}
