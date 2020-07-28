package com.eomcs.basic.ex05;
// 관계연산자 (relational operators)
// 등위연산자 (equality operators)

public class Exam0210_test {
  public static void main(String[] args) {
    
    int a = 10;
    int b = 20;
    
    boolean r1 = a < b;
    // int r2 = a < b; 컴파일 오류
    
    System.out.println(a < b);
    System.out.println(a <= b);
    System.out.println(a > b);
    System.out.println(a >= b);
    System.out.println(a == b);
    System.out.println(a != b);
    
  }
}
