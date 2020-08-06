package com.eomcs.oop.ex02;

public class Exam0113 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;



    }
  static void printCalculator(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
  }


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
    printCalculator(s1);
    printScore(s1);

    s2.name = "임꺽정";
    s2.kor = 98;
    s2.eng = 70;
    s2.math = 87;
    printCalculator(s2);
    printScore(s2);



  }

}
