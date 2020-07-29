package com.eomcs.basic.ex05;
// 후위 증감 연산자 II

public class Exam0640_test {
  public static void main(String[] args) {
    int i = 2;
    int result = i++ + i++ * i++; 
    
    System.out.printf("%d, %d\n",i,result);
  }
}
