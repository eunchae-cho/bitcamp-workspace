package com.eomcs.basic.ex05;
// 비트 이동 연산자 >> >>> <<

public class Exam0410_test {
 public static void main(String[] args) {
  
   int i = 1;
  
  System.out.println(i << 1);
  System.out.println(i << 2);
  System.out.println(i << 3);
  System.out.println(i << 4);
  
  i = 0b000_1011; //11
  System.out.println(i << 1);
  System.out.println(i << 2);
  System.out.println(i << 3);
  
}
}
