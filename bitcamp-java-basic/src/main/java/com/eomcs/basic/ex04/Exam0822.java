package com.eomcs.basic.ex04;
// 로컬 변수와 블록 III

public class Exam0822 {
  public static void main(String[] args) {
    
    int a = 100;
    
    switch(a) {
      case 1:
        // switch 바깥 블록에 같은 이름의 변수가 있다.
        //int a; 컴파일 오류
        int b;
        {
          
          int c;
        }
        break;
      case 2:
        // case는 다른 블록으로 취급하지 않는다.
        // case에서 선언한 변수는 switch 문에 소속
        // 따라서 같은 이름의 변수 선언 불가
        //int b;
        int c; //ok
        break;
        
      case 3:
        for(int i = 0; i < 100; i++) {
          // int b; 컴파일 오류
        }
        break;
        default:
    }
  }
}
