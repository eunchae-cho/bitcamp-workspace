package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score3;

public class Exam0118 {


  static void printScore(Score3 s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",s.name,s.kor,s.eng,s.math,s.sum,s.aver);
  }

  public static void main(String[] args) {

    Score3 s1 = new Score3();
    Score3 s2 = new Score3();

    s1.init("홍길동", 100, 90, 87);
    printScore(s1);

    s2.init("임꺽정", 98, 70, 87);
    printScore(s2);

    s1.init("홍길동", 50, 88, 80);
    printScore(s1);

  }

}
