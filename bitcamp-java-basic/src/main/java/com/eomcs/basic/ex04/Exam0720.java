package com.eomcs.basic.ex04;
// 변수의 종류 - 종류에 따른 변수의 사용 범위

public class Exam0720 {
  
    
  int a;
  static int b;
    
  public static void main(String[] args) {
    
    int c;
    b = 20;
    // a = 100; 컴파일 오류 - static 붙지 않은 인스턴스 변수는 사용 불가능
    
  }
  
  public static void m2() {
    b = 20;
    // a= 100; 컴파일 오류 - static 붙지 않은 인스턴스 변수는 사용 불가능
    // c = 100; 다른 메서드에 선언된 로컬 변수를 사용할 수 없음
    
  }
  
  public void m3(){
    // static이 붙지 않은 블록에서는 
    // 그 블록 바깥쪽에 선언된 변수를 모두 접근할 수 있다.
    
    b = 20;
    a = 100;
  }
  
  public void m4() {
    b = 20;
    a = 100;
  }
}
