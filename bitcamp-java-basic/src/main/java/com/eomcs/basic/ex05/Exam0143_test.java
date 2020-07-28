package com.eomcs.basic.ex05;
// 산술 연산자 - 연산의 결과 타입 III

public class Exam0143_test {
  public static void main(String[] args) {
    float f1 = 987.6543f;
    float f2 = 1.111111f;
    System.out.println(f1);
    System.out.println(f2);
    
    float r1 = f1 + f2;
    System.out.println(r1);
    // float은 7자리수만 출력되기 때문에 7자리 수만 출력됨
    
    double r2 = f1 + f2;
    System.out.println(r2);
    // 생각보다 값이 소수점이 더 많이 나옴
    // double 변수에 저장되기 이전에 float 값이 되면서
    // 일부 값이 왜곡되어 버림
    // IEEE 754 이진수 변환 문제 때문

    // 그냥 안전하게 double로 메모리를 충분히 확보한다.
    double d1 = 987.6543;
    double d2 = 1.111111;
    double r3 = d1 + d2;
    System.out.println(r3);
    // 이유는 IEEE 754 이진수 변환 문제 때문이다.
    // 맨 뒤에 붙은 극한의 작은 수는 그냥 잘라버린다.
  }

}
