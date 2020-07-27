package com.eomcs.basic.ex04;
// 명시적 형변환 : 큰 정수 변수의 값을 작은 정수 변수에 저장

public class Exam0940 {
  public static void main(String[] args) {
    
    byte b = 100;
    short s = 100;
    int i = 100;
    long l = 100;
    
    //short ==> byte
    byte b2 = (byte) s;
    System.out.println(b2);
    
    //int ==> byte
    b2 = (byte) i;
    
    //long ==> byte
    b2 = (byte) l;
    
    int i2 = 0b0000_0000_0000_0000_0000_0001_0010_1100; //=300
    b2 = (byte) i2;
    System.out.println(b2); //0b0010_1100 = 44
    
    l = 400_0000_0000L;
    i = (int) l;
    System.out.println(i); // 앞 쪽 바이트가 잘린다.
    System.out.println(0x502f9000);
    
  }
}
