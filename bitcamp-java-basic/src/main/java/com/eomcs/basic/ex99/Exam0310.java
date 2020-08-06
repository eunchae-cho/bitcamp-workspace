package com.eomcs.basic.ex99;


import java.util.Scanner;

public class Exam0310 {

  static class Math {

    public static int abs(int value) {
      if (value < 0)
        return value * -1;
      return value;
    }
  }
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    // 이렇게 특정 인스턴스의 변수를 다루는 것이 아니라
    // 외부에서 전달한 파라미터 값을 가지고 작업을 수행하는 메소드인 경우
    // 클래스 메소드로 정의하면 사용하기 편하다.

    System.out.print("입력: ");
    int value = keyScan.nextInt();
    int result = Math.abs(value);


    System.out.printf("절대값 = %d\n",result);
    }
}

