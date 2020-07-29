package com.eomcs.basic.ex05;
// 증감 연산자 - 후위 감소 연산자

public class Exam0620_test {
  public static void main(String[] args) {
    
    int i = 7;
    
    i--; //6
    
    i--; //5
    
    System.out.println(i); //5
    System.out.println(i--); //5 괄호에 있는 것은 이후에 처리된다.
                              // 변수를 넣은 것이 아님
    System.out.println(i); //4
  }

}
