package com.eomcs.oop.ex02.util;

public class Score4 {

  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;


  public void calculator() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

  //생성자
  //  메소드 이름은 클래스와 동일하게 짓는다.
  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    this.calculator();
  }

}