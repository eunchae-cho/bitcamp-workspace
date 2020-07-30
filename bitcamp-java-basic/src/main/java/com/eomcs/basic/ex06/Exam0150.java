package com.eomcs.basic.ex06;
// 흐름 제어문 - else문의 소속

public class Exam0150 {
  public static void main(String[] args) {
    int age = 15;

    if (age >= 19)
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    else
        System.out.println("미성년입니다.");
    // else가 첫번째 if가 아니라 두번째 중첩된 if에 소속됨
    // else는 if else를 한문장으로 간주하므로 단독 실행 불가
    System.out.println("-------------------");

    // else가 두번째 if에 소속될 때
    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    else
        System.out.println("미성년입니다.");
    }

    System.out.println("-------------------");

    // else가 첫번째 if에 소속될 때
    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    }
    else
      System.out.println("미성년입니다.");

  }
}
