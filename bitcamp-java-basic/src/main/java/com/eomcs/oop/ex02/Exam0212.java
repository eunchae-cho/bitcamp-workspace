package com.eomcs.oop.ex02;
// class 문법 연습2

import com.eomcs.util.Calculate3;

public class Exam0212 {
  public static void main(String[] args) {
    // 5 + 4 - 7 / 1 * 3
    // 6 * 4 / 2 - 4 + 2

    Calculate3 c1 = new Calculate3();
    Calculate3 c2 = new Calculate3();

    c1.plus(5);
    c1.plus(4);
    c1.minus(7);
    c1.divide(1);
    c1.multiple(3);
    printResult(c1.result);

    c2.plus(6);
    c2.multiple(4);
    c2.divide(2);
    c2.minus(4);
    c2.plus(2);
    printResult(c2.result);
  }



  static void printResult(int result) {
    System.out.println("*********");
    System.out.println("답: "+result);
    System.out.println("*********");
  }
}
