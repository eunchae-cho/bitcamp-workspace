package com.eomcs.basic.ex05.assignment;


//# 과제 : 다음 int변수에 들어있는 값을 
//          첫 바이트부터 끝 바이트까지 순서대로 출력하라

// 비트 이동 연산자와 & 비트 연산자 사용

//실행 예)
//aa
//bb
//cc
//dd
//
public class Test03 {

  public static void main(String[] args) {
  
    int value = 0xaabbccdd; //10101010 10111011 11001100 11011101 
    
    //코드를 완성하시오
    System.out.println(Integer.toBinaryString(value));
    
    // int a = (value >> 24) & 0x000000ff; //음수 값이기 때문에 0xff를 해야한다.
    int a = value >>> 24;
    int b = (value >> 16) & 0xff;
    int c = (value >> 8) & 0xff;
    int d = value & 0xff;
    
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
  
  }

}








