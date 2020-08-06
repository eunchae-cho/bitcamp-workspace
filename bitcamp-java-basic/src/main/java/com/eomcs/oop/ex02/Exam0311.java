package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Scores;

// 클래스 분리 연습

public class Exam0311 {

  public static void main(String[] args) {

    Scores s = new Scores("홍길동",85,92,90,74,98);
    s.Calculator();
    s.printScore();
  }


}
