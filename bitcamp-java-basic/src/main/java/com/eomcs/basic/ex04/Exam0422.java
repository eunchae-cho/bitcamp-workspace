// 부동소수점 변수 - 변수의 메모리 크기 II

package com.eomcs.basic.ex04;

public class Exam0422 {
  public static void main(String[] args) {
   
    // 8바이트 부동소수점 변수
    // 15자리수 저장
    
    double d;
    
    d = 9.99999999988888;
    System.out.println(d);
    
    d = 9999999.88888888;
    System.out.println(d);
    
    d = 999999999998888.8;
    System.out.println(d);
    
    d = 0.00000999999999988888;
    System.out.println(d);  // 소수점 뒤 0 제외됨
    
    d = 9.9999999999999997;
    System.out.println(d);  // 반올림되거나 잘림
    
    d = 9999999999999999.7;
    System.out.println(d);  // 반올림되거나 잘림
  }
}
