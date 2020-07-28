package com.eomcs.basic.ex05;
// 산술연산자 - 연산의 결과 타입 II

public class Exam0142_test {
  public static void main(String[] args) {
    
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    
    int r1 = x + y;
    System.out.println(r1);
    // int와 int의 결과가 int가 넘어가면 원하는 결과값이 아니다.
    
    long r2 = x + y;
    System.out.println(r2);
    // 더 큰 정수값 메모리에 넣어도 해결이 되지 않는다.
    
    r2 = (long)x + (long)y;
    System.out.println(r2);
    // 암시적 형변환을 시켜서 계산해야 한다.
    
    
  }
}
