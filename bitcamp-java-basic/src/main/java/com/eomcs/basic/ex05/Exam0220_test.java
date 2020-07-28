package com.eomcs.basic.ex05;
// 관계 연산자 : 부동소수점 비교

public class Exam0220_test {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println(d1 + d2 == 988.765411);
    System.out.println(d1 + d2);
    
    
    double x = 234.765411;
    double y = 754.0;
    System.out.println(x + y == 988.765411);
    
    // 극소수값 해결 방법
    double EPSILON = 0.00001;
    System.out.println(Math.abs(d1 + d2) - (x + y) < EPSILON);
    
  }

}
