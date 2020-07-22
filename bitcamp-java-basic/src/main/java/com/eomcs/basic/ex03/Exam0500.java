package com.eomcs.basic.ex03;


// 논리값 리터럴 - true, false
public class Exam0500 {
  public static void main(String[] args) {
    
    
    // true = 1, false = 0 의 값으로 나타낸다.
    System.out.println(true);
    System.out.println(false);
    
    // 비교 연산자를 이용한 참 거짓 판단
    System.out.println(4 > 5);
    System.out.println(4 < 5);
    
    // 논리 연산자를 이용해 참 거짓 판단
    System.out.println(true && false);
    System.out.println(true || false);
    
    // 유니코드 값 비교 및 판단
    System.out.println(65 == 'A');
    System.out.println(65 == 'B');
    
    // System.out.println((boolean)1); 컴파일 오류 
    // 숫자를 true or false로 변환할 수 없다.
    
    
    
  }

}
