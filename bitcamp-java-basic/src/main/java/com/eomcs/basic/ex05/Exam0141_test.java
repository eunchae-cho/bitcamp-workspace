package com.eomcs.basic.ex05;
// 산술 연산자 - 연산 결과 타입

public class Exam0141_test {
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    float r = i / j;
    System.out.println(r);
    
    r = (float)i / (float)j;
    System.out.println(r);
    
  }
}
