package com.eomcs.basic.ex05;
// 비트 연산자 &를 이용하여 % 연산구하기
// 홀짝을 알아내거나 2의 나머지를 알고 싶을 때 사용

public class Exam0351_test {
  public static void main(String[] args) {
    
    //나머지가 1이라면 홀수     
    System.out.println(57 % 2);
    System.out.println(57 & 0b1); // & 1
    
    System.out.println(57 % 8);
    System.out.println(57 & 0b111); // & 7
    
    System.out.println(57 % 16);
    System.out.println(57 & 0b1111); // & 15
    
  }
}
