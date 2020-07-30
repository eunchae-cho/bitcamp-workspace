// 부동소수점 변수 - 변수와 리터럴의 크기 II

package com.eomcs.basic.ex04;

public class Exam0424 {
  public static void main(String[] args) {
    float f;
    double d;
    
    
    f = 99999.8888877777f; // 반올림됨
    System.out.println(f);
    
    d = 99999.8888877777f; // 반올림되고 쓰레기값 붙음
    System.out.println(d);
    
    f = 99999.88f;
    System.out.println(f);
    
    d = 99999.8888877777;
    System.out.println(d);
  }
}
