package com.eomcs.basic.ex05;
// & 비트 연산자 활용 III
// 그림의 한 픽셀에서 빨강색을 제거하고 싶다.

public class Exam0354_test {
  public static void main(String[] args) {
    int pixel = 0x003f4478;
    System.out.println(pixel & 0x0000ffff);
    
    // pixel = 00000000 00111111 01000100 01111000
    //       & 00000000 00000000 11111111 11111111
    // --------------------------------------------
    //         00000000 00000000 01000000 01111000
    
  }

}
