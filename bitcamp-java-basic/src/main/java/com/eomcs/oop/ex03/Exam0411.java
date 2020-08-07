package com.eomcs.oop.ex03;

public class Exam0411 {


  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;


  Score() {
    System.out.println("Score()");
  }

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
  }

  public static void main(String[] args) {
    Score s1 = new Score();

    Score s3 = new Score();
  }

}
