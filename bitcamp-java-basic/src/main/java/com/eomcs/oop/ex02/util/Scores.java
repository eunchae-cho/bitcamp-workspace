package com.eomcs.oop.ex02.util;

public class Scores {

  public String name;
  public int kor;
  public int eng;
  public int math;
  public int bio;
  public int korHis;
  public int sum = kor + eng + math + bio + korHis;
  public float aver = sum / 5f;


  public Scores(String name, int kor, int eng, int math, int bio, int korHis) {

    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.bio = bio;
    this.korHis = korHis;

    Calculator();
  }


  public void Calculator() {
    sum = kor + eng + math + bio + korHis;
    aver = sum / 5f;

  }


  public void printScore() {
    System.out.printf("%s, %d, %d, %d, %d, %d, %d, %.1f",
        name,kor,eng,math,bio,korHis,sum,aver);

  }
}
