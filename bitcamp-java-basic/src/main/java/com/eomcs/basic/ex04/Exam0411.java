// 정수 변수 - 변수의 메모리 크기

package com.eomcs.basic.ex04;

public class Exam0411 {
  public static void main(String[] args) {
    
    byte b;
    b = -128; // 10000000
    b = 127;  // 01111111
    
    short s;
    s = -32768; // 100000000 00000000
    s = 32767;  // 011111111 11111111
    
    int i;
    i = -2147483648; // 10000000 00000000 00000000 00000000
    i = 2147483647;  // 01111111 11111111 11111111 11111111
    
    long l;
    l = -9223372036854775808L; 
    l = 9223372036854775807L;
    
    
  }
}