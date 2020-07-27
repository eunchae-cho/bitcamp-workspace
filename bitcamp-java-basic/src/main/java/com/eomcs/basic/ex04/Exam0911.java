package com.eomcs.basic.ex04;
// 형변환 - 정수 변수 ==> 부동소수점 변수

public class Exam0911 {
  public static void main(String[] args) {
    byte b = 100;
    short s = 100;
    int i = 98765678;
    long l = 98765678;
    char c = 100;
    
    float f;
    double d;
    
    f = b;
    System.out.println(f);
    
    f = s;
    System.out.println(f);
    
    f = i;
    System.out.println(f);
    
    f = l;
    System.out.println(f);
    
    f = c;
    System.out.println(f);
  }
}
