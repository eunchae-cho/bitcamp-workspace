package com.eomcs.basic.ex05;
// 논리 연산자

public class Exam0330_test {
  public static void main(String[] args) {
    
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    
    System.out.printf("a=%b, b=%b, c=%b\n",a,b,r);
    
    a = true;
    b = false;
    r = a && (b = true);
    System.out.printf("a=%b, b=%b, c=%b\n",a,b,r);
    
    a = false;
    b = false;
    r = a & (b = true);
    System.out.printf("a=%b, b=%b, c=%b",a,b,r);
  }
}
