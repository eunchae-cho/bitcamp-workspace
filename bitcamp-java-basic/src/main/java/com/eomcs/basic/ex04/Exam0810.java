package com.eomcs.basic.ex04;
// 로컬 변수 선언

public class Exam0810 {    // 클래스 선언
  // 클래스 블록 => 클래스 정의
  
  static int x;
  
  
  
  public static void main(String[] args)    // 메서드 선언
  {  // 메서드 블록 => 메서드 정의
    
    int a;
    int x; 
    //같은 메서드 블록에 소속된 로컬 변수가 아니라면 같은 이름으로 변수를 만들어 선언 가능
    
    // int a;       컴파일 오류 - 문법 오류
    // 이름이 같은 변수를 중복 선언할 수 없다.
    // 하지만 javasrcipt에서는 가능
    
    { // 로컬 블록
      // int a; // 바깥 블록에 선언된 변수와 같은 이름을 가질 수 없다.
      int b;
      {// 하위 로컬 블록
        // int b; 바깥 블록에 선언된 같은 이름의 변수를 선언할 수 없다.
        int c;
      }
      
      // c= 100; 컴파일 오류
      // 블록 안에 선언된 변수는 블록을 나가는 순간 자동 삭제된다.
      b = 100; // ok
      
      int c;  // 이 c변수는 위에서 선언한 하위 블록의 c 변수가 다르다.
      {
        int d;  // 이전 블록에서 만든 d변수는 이미 삭제 되었기 때문에 
                // 이 블록에서 같은 이름으로 변수를 만들 수 있다.
      }
    
      b = 100;
      c = 200;
      //d = 100; 이미 전의 블록에서 삭제 되었기 때문에 사용 불가
      a = 300;
    }
    
    int i;
    for(i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println(i);
    
    
    for(int k = 0; k < 10; k++) {
      System.out.println(k);
    }
    // System.out.println(k); k를 선언한 블록 밖에 나왔기 때문에 안 됨
    
    int age = 20;
    int m = 0;
    if(19 < age) {
      m = 200;
      int n = 300;
    }
    System.out.println(m); 
    // System.out.println(n); 블록 밖에 있으므로 변수n은 더이상 유효하지 않음
    
    
    
  }
}
