package com.eomcs.oop.ex07.a;


class Score{

  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

}


public class Exam0110 {
  public static void main(String[] args) {

    Score s = new Score();
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    s.compute();
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name,s.kor,s.eng,s.math,s.sum,s.aver);
  }
}
