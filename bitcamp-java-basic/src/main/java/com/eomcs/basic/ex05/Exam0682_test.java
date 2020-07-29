package com.eomcs.basic.ex05;
// 증감 연산자 응용 II

public class Exam0682_test {
  public static void main(String[] args) {
    
    // 1) pre-fix 연산자나 post-fix 연산자를 리터럴에 적용할 수 없다.
    // int x = ++100;  컴파일 오류
    // x = 100++  컴파일 오류
    
    int y = 100;
    // 2) 변수에 동시에 적용할 수 없다.
    // ++y++;  컴파일 오류
    // (++y)++  컴파일 오류
    // ++(y++)  컴파일 오류
  }
}
