package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score;

public class Exam0116 {


  static void printScore(Score s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",s.name,s.kor,s.eng,s.math,s.sum,s.aver);
  }

  public static void main(String[] args) {

    Score s1 = new Score();
    Score s2 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.calculator();
    printScore(s1);

    s2.name = "임꺽정";
    s2.kor = 98;
    s2.eng = 70;
    s2.math = 87;
    s2.calculator();
    printScore(s2);



  }

}
