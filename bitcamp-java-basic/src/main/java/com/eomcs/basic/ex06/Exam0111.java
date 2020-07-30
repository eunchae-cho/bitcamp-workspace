package com.eomcs.basic.ex06;
// 조건문
// if-else 문 - 상호배타적이지 않을때

public class Exam0111 {
  public static void main(String[] args) {

    int gender = 2;

    if (gender == 1) {
      System.out.println("여성");
      System.out.println("------");
    } else {                          //{}블록을 하지 않으면 컴파일 에러
      System.out.println("남성");
      System.out.println("------");
    }

    System.out.println("==========================");


    int age2 = 17;

    if (age2 >= 19)
      if (age2 >= 65)
        System.out.println("지하철 무임승차 가능합니다.");
      else        // else는 if문에 소속된 if else가 한문장 두번째 if에 소속
        System.out.println("성인입니다.");
    //    else        // 첫번째 if에 소속
    //      System.out.println("미성년자입니다.");

    // 이 경우 아무것도 출력되지 않는다.

    System.out.println("==========================");

    // {}중괄호를 묶어야 제대로 나온다.
    if (age2 >= 19) {
      if (age2 >= 65)
        System.out.println("지하철 무임승차 가능합니다.");
    } else {
      System.out.println("미성년자입니다.");
    }

    System.out.println("==========================");

    int age3 = 5;

    if (age3 < 8)
      System.out.println("아동");
    else        // 한문장이니 중괄호를 치지 않아도 실행된다.
      if (age3 < 14)
        System.out.println("어린이");
      else
        if (age3 < 19)
          System.out.println("청소년");
        else
          if (age3 < 65)
            System.out.println("성인");
          else
            System.out.println("노인");


    System.out.println("==========================");

    age3 = 66;

    if (age3 < 8)
      System.out.println("아동");
    else if (age3 < 14)
      System.out.println("어린이");
    else if (age3 < 19)
      System.out.println("청소년");
    else if (age3 < 65)
      System.out.println("성인");
    else
      System.out.println("노인");
    // 자바는 else if 문법이 존재하지 않는다.
    // if-else 안에 if가 있는 것이고 보기 좋게 위처럼 놓은 것이다.

    System.out.println("==========================");

    age3 = 22;

    if (age3 < 8) {
      System.out.println("아동");
    } else if (age3 < 14) {
      System.out.println("어린이");
    } else if (age3 < 19) {
      System.out.println("청소년");
    } else if (age3 < 65) {
      System.out.println("성인");
    } else {
      System.out.println("노인");
    }

  }
}
