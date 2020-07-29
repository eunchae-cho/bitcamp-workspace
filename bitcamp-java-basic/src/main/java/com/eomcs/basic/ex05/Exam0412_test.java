package com.eomcs.basic.ex05;
// 비트 이동 연산자  <<

public class Exam0412_test {
  public static void main(String[] args) {
    
    System.out.println(3 << 1);
    
    // << 최대는
    System.out.println(3 << 33);
    System.out.println(3 << 65);
    System.out.println(3 << 97);
    
    // int 타임의 값에 대해 비트 이동을 할 때는 0~31까지 유효
    // 만약 31을 넘는 경우 32로 나눈 나머지 값을 비트 이동 간주
    // long은 0~63까지 유효
    
    // 3 << 33 와 3 & 0b1111(33)는 같다
  }
}
