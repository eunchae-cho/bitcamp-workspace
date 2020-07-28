package com.eomcs.basic.ex05;
// 논리 연산자 

public class Exam0310_test {
  public static void main(String[] args) {
    
    System.out.println("------ AND 연산자 -----");
    
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);
    
    System.out.println("----- OR 연산자 -----");
    
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
    
    System.out.println("----- NOT 연산자 -----");
    
    System.out.println(!true);
    System.out.println(!false);
    
    System.out.println("----- XOR 연산자 -----");
    
    System.out.println(true ^ true);
    System.out.println(false ^ false);
    System.out.println(true ^ false);
  }
}
