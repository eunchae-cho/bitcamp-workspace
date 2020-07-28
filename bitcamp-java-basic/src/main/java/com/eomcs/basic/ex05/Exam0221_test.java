package com.eomcs.basic.ex05;
// 관계 연산자 - 부동 소수점 비교

public class Exam0221_test {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;
    System.out.println(f1 * f2 == 0.01f);
    
    System.out.println(f1 * f2);
    
    // 뒤에 오는 소수점 해결 방법
    float r = f1 * f2 - 0.01f;
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
  }
}
