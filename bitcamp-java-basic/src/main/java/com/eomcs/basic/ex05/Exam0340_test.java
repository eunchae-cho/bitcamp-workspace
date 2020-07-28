package com.eomcs.basic.ex05;
// 논리 연산자

public class Exam0340_test {
  public static void main(String[] args) {
    
    boolean a = true;
    boolean b = false;
    boolean r = a  || (b = true);
    
    System.out.printf("a=%b, b=%b, r=%b\n",a,b,r);
    
    
    a = false;
    b = false;
    r = (a = true) || (b = true);
    
    System.out.printf("a=%b, b=%b, r=%b\n",a,b,r);
    
    a = true;
    b = false;
    r = a | (b = true);
    
    System.out.printf("a=%b, b=%b, r=%b\n",a,b,r);

  }
}
