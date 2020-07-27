package com.eomcs.basic.ex04;
// 형변환 - 부동소수점 변수 ==> 정수 변수

public class Exam0920 {
  public static void main(String[] args) {
    float f = 3.12f;
    double d = 9876.56789;
    
    //int i = f;
    //long l = f;
    // 컴파일 오류! 부동소수점 메모리의 값을 정수 메모리에 저장 불가
    // 정수 메모리는 소수점 이하의 값을 저장할 수 없다.
  }
}
