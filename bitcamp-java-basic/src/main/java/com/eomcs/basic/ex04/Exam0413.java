// 정수 변수 - 크기가 다른 변수끼리 값 할당

package com.eomcs.basic.ex04;

public class Exam0413 {
  public static void main(String[] args) {
    
    long l =100;
    int i = 100;
    short s = 100;
    byte b = 100;
    char c = 100;
    
    long l2;
    int i2;
    short s2;
    byte b2;
    char c2;
    
    // long => long 이상
    l2 = l;
    //i2 = l;
    //s2 = l;
    //b2 = l;
    //c2 = l;
    
    // int => int 이상
    l2 = i;
    i2 = i;
    //s2 = i;
    //b2 = i;
    //c2 = i;
    
    // short => short 이상
    l2 = s;
    i2 = s;
    s2 = s;
    //b2 = s;
    //c2 = s;
    
    //byte => byte 이상
    l2 = b;
    i2 = b;
    s2 = b;
    b2 = b;
    //c2 = b;
    
    
  }
}
