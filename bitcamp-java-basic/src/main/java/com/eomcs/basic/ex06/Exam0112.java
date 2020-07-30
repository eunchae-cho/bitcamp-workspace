package com.eomcs.basic.ex06;
// 조건문
// if문 - 상호배타적일 때

public class Exam0112 {
  public static void main(String[] args) {
    
    int age = 64;
    
//    if (age > 18) 
//      System.out.println("성인");
//      System.out.println("미성년자");  // 이 상태는 if문에 종속되지 않는다.
//      
    if (age >= 19) {        // 여러개의 문장을 나오게 하려면 {}블록을 사용해서 묶어라
      System.out.println("성인");
      
    if (age >= 65)
      System.out.println("노인연금 수령 대상자 입니다.");
    }
  }
}
