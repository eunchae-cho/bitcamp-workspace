package com.eomcs.basic.ex04;
// 형변환 - 명시적 형변환
// explicit type conversion

public class Exam0930 {
  public static void main(String[] args) {
    float f = 3.14f;
    int i = (int) f;
    System.out.println(i);
    
    double d = 9876.56789;
    long l = (long) d;
    System.out.println(l);
    
    // 소수점이하가 제거됨
  }

}
