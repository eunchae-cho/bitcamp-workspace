package com.eomcs.basic.ex05;
// 비트 이동 연산자 >>>

public class Exam0430_test {
  public static void main(String[] args) {
    
    // 무조건 0으로
    int i = 0b01101001;
    
    // >>> 양수
    System.out.println(i);
    System.out.println(i >>> 1);
    System.out.println(i >>> 2);
    System.out.println(i >>> 3);
    System.out.println(i >>> 4);
    
    // 2제곱 나누기와 비슷함
  }
}
