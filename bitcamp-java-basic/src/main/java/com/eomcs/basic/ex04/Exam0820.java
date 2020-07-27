package com.eomcs.basic.ex04;
// 로컬 변수와 블록

public class Exam0820 {
  public static void main(String[] args) {
    
    int a = 100;
    {
      // int a = 200; 컴파일 오류
      // 같은 메서드 블록 안에서는 이름 중복 불가
      // 안쪽 블록에서는 바깥 블록의 변수를 사용 가능
      a = 200;
      int b = 300;
    }
    System.out.println(a);

  
    {
      int b = 400;
      // 이전 블록에서 선언된 변수는 그 블록이 종료되는 순간
      // 제거되기 때문에 다음과 같이 같은 변수의 선언 가능
    }
    
  }
}
