package com.eomcs.basic.ex05;
// 산술 연산자 : 명시적 형변환

public class Exam0170_test {
  public static void main(String[] args) {
    byte b;
    
    // b = 256;
    b = (byte)256;
    // R-Wert가 기본 정수형 int인데 byte로 명시적 형변환 했기 때문에
    // 값이 잘리게 된다.
    //  int : 00000000 00000000 0000001 00000000
    //byte :  -------- -------- ------- 00000000 = 0
    
    System.out.println(b);
  }
}
