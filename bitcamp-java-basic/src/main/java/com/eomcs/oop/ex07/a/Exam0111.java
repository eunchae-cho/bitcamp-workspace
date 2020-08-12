package com.eomcs.oop.ex07.a;

public class Exam0111 {
  public static void main(String[] args) {

    Score s = new Score();

    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    s.compute();

    // 계산을 한 후 임의적 합계와 평균
    s.sum = 300;
    s.aver = 100f;
//    s.sum =  s.kor + s.eng + s.math;
//    s.aver = s.sum / 3f;


    // 원래 의도한 것처럼 나오지 않음
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name,s.kor,s.eng,s.math,s.sum,s.aver);
  }

}
