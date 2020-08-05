package com.eomcs.oop.ex02;
// class 문법 연습

// 1) 한 클래스 안에 메인 메소드,계산을 위탁받는 메소드 생성
//      - 메소드 호출(call by value, call by reference) 사용
//      - static 메소드
// 2) 다른 패키지에 속하는 클래스 하나를 새로 추가
//      - 계산하는 메소드를 분리시킴
//      - non-static 메소드
// 3) 객체 하나를 두 개로 복사하여 두가지 산술을 시행
//      - new로 객체(인스턴스) 생성
//      - this 사용
import com.eomcs.util.Calculate2;

public class Exam0211 {
  public static void main(String[] args) {

    // 4 + 7 * 2 - 1 + 8 / 2
    // 3 + 9 - 3 * 6 / 2
    Calculate2 c1 = new Calculate2();
    Calculate2 c2 = new Calculate2();

    c1.plus(4);
    c1.plus(7);
    c1.multiple(2);
    c2.plus(3);
    c2.plus(9);
    c2.minus(3);
    c2.multiple(6);
    c2.divide(2);
    c1.minus(1);
    c1.plus(8);
    c1.divide(2);
    printCalculation(c1.result);
    printCalculation(c2.result);



  }


  static void printCalculation(int result) {
    System.out.println("*******");
    System.out.println("답: "+result);
    System.out.println("*******");

  }
}
