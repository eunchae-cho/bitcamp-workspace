package com.eomcs.basic.ex05;
// 비트 연산자

public class Exam0431_test {
  public static void main(String[] args) {
    
    // 무조건 0으로
    int i = 0b11111111_11111111_11111111_10101001;
    System.out.println(i);
    
    // >>> 음수
    System.out.println(i >>> 1);
    System.out.println((i >>> 2));
    System.out.println(i >>> 3);
    System.out.println(i >>> 4);
  }
}
