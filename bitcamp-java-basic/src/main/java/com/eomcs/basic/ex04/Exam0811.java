package com.eomcs.basic.ex04;
// 변수의 종류 - 같은 블록에서는 중복 선언 불가

public class Exam0811 {
  
  int a;
  static int b;
  
  public static void main(String[] args) {
    // 메서드 블록에서는 클래스 블록에서 선언된 변수의 이름과
    // 같은 변수를 선언할 수 있다. 영역이 다르기 때문
    int a;
    int b;
    
  }
  
  public static void m2() {
    // 여기서 선언된 변수는 클래스 블록과 main()블록에
    // 선언된 변수와 다른 변수이다.
    int a;
    int b;
  }
}
