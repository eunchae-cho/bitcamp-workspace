// 부동소수점 변수 - 변수의 메모리 크기

package com.eomcs.basic.ex04;

public class Exam0421 {
  public static void main(String[] args) {
    
    // 4바이트 부동 소수점 변수
    // 7자리수 저장
    float f;
    
    f = 9.876545f;
    System.out.println(f);
    
    f = 987654.5f;
    System.out.println(f);
    
    f = 0.0000098765454f;
    System.out.println(f); // 소수점 뒤가 0만 있는 경우 0제외시킴
    
    f = 9.8765465f;
    System.out.println(f); // 맨 뒤 값이 반올림 됨
    
    f = 9876545.6f;
    System.out.println(f); // 맨 뒤 값이 반오림 됨
    
    
  }
}
