package com.eomcs.oop.ex02;

import com.eomcs.util.Calculate;

public class Exam0210 {

// class 문법
// 1. 유지 보수가 쉽도록 서로 관련된 일을 하고 메소드를 한 블럭으로 묶는다.
// 2. 특정 상황에 맞는 데이터를 다루기 쉽도록 메모리를 설계한다.
//          => 새 데이터 타입을 정의 (user defined data type)


  public static void main(String[] args) {
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?
    // 연산자 우선순위 고려하지 말고 나온 순서대로 일단 계산해보자

    // 식1과 식2를 동시에 계산할 수 있는가
    // => 불가하다
    // => Calculator는 result 변수를 한 개만 관리하기 때문에
    //    동시에 여러개의 식 결과를 따로 관리할 수 없다.
    // 식1과 식2를 따로 놓고 차례대로 계산해야한다.

    // 식1롸 식2를 동시에 계산하려면 result 변수를 두 개 준비해야 한다.
    Calculate c1 = new Calculate();
    Calculate c2 = new Calculate();

    c1.plus(2);
    c2.plus(3);
    c1.plus(3);
    c2.multiple(2);
    c1.minus(1);
    c2.plus(7);
    c1.multiple(7);
    c2.divide(4);
    c1.divide(3);
    c2.minus(5);
    printResult(c1.result); // 클래스 변수 사용시 자동 초기화
    printResult(c2.result);

  }




  static void printResult(int value) {
    System.out.println("********");
    System.out.printf("결과: %d\n",value);
    System.out.println("********");
  }
}


//메소드는 크게 2가지로 구분된다.
// 1) 변수와 값을 사용하는 메소드
//      예: System.out.println(), Date.valueOf()
//      => static 메소드를 사용한다 메모리를 따로 저장할 필요가 없기 때문

// 2) 값을 사용하는 메소드
//      예: c1.plus(100);
//      => instance 메소드(non-static) 사용한다 변수를 사용하기 때문
//         인스턴스안에 메소드가 있는게 아니라 메소드 구역에 메소드가 저장됨

