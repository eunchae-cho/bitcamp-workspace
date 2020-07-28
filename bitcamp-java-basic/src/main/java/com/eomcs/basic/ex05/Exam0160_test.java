package com.eomcs.basic.ex05;
// 산술 연산자 : 암시적 형변환과 연산 우선순위

public class Exam0160_test {
  public static void main(String[] args) {
    float r1 = 5 / 2 + 3.1f;
    System.out.println(r1);
    
    float r2 = 3.1f + 5 / 2;
    System.out.println(r2);
  }
  

}
