// 부동소수점 변수 - 변수와 리터럴의 크기 III

package com.eomcs.basic.ex04;

public class Exam0425 {
  public static void main(String[] args) {
    
    float f1 = 99988.88f;
    float f2 = 11.11111f;
    
    System.out.println(f1);
    System.out.println(f2);
    
    
    float f3 = f1 + f2;
    System.out.println(f3);
    
    double d = (double)f1 + (double)f2;
    // double d = (double)f3 라고 하면 안된다. 왜냐하면 이미 더한값 f3가 잘렸기 때문
    System.out.println(d); // 더한값이 정확하지 않을뿐더러 뒤에 쓰레기값 생김
    
    // 애초에 그냥 double로 변수 선언을 한다.
    double d1 = 99988.88;
    double d2 = 11.11111;
    double d3 = d1 + d2;
    System.out.println(d3);
  }
}
