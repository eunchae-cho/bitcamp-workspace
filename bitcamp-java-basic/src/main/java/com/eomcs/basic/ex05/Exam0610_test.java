package com.eomcs.basic.ex05;
// 증감 연산자 - 후위(post-fix) 증가 연산자

public class Exam0610_test {
  public static void main(String[] args) {
    
    int i = 2;
    
    i++; //3
    
    i++; //4
    
    System.out.println(i); //4
    System.out.println(i++); //4 이 문장을 떠날때 i가 하나 증가
    System.out.println(i); //5
  }
}
