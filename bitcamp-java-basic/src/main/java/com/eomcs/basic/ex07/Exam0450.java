package com.eomcs.basic.ex07;
// 스택 메모리 응용 II
// 재귀 호출

public class Exam0450 {
  static int sum(int value) {
    if (value == 1) {
      return 1;
    }
    return value + sum(value - 1);
  }

  public static void main(String[] args) {
    System.out.println(sum(5));
  }
}
