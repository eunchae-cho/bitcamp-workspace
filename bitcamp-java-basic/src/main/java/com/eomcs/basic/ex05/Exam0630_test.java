package com.eomcs.basic.ex05;
// 후위 증감 연산자 응용 I

public class Exam0630_test {
  public static void main(String[] args) {
    int i =7;
    int j = i++; // j의 값은 i이고 i값은 하나 올라간다.
    
    System.out.println(j); //7
    System.out.println(i); //8
    
    i = i++;
    System.out.println(i);
 
    
    // 후위 증감 연산자는 연산식이 실행되고 나서 값이 하나 증감된다.
  }
}
