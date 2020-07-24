// 문자 변수

package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    char c;
    
    c = 0;
    c = 65535;
    //c = -1;               음수는 없다.
    //c = 65536;            메모리 값 넘음
    
    c = 65;
    c = 0x42;           // 유니코드값 가능
    c = 0b01000011;     // 이진법도 쌉가능
    System.out.println(c);  // 유니코드 값
    
    short s = 65;
    System.out.println(s);
    
    // 같은 메모리값을 가져도 char는 문자 코드용 short는 숫자용
    
    c ='헐';           // '' 연산자는 문자의 유니코드 값 리턴
    System.out.println(c);      // 자바는 유니코드:)
    
    //s = '헐';          short는 65536보다 메모리가 작기 때문에 안 됨
    s = 'A';            // 이건 A의 값이 65이기 때문에 가능
    int i = '헐';
    i = c;
    
    // 문자 코드는 정수 값이다.
    for (int x = 65; x < 80; x++) {
      System.out.println((char)x);
    }
    
    boolean b1, b2;
    b1 = true;
    b2 = false;
    System.out.println(b1);
    System.out.println(b2);
    
    // 논리 값은 정수로 다룰 수 없다.
    // i = b1;
    // i = b2;
    // b1 = 1;
    
  }

}
