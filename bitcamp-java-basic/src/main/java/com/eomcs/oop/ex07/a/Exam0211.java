package com.eomcs.oop.ex07.a;

public class Exam0211 {
  public static void main(String[] args) {
    Score2 s = new Score2();

    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;

    s.compute();

    // 만약 개발자가 국 영 수 점수를 변경한 수 compute()를 호출하지 않았다면?
    s.eng = 100;
    s.math = 100;

    // 다음과 같이 변경한 후 compute()를 호출했어야 한다.
    // 근데 대부분 까먹고 잘 하지 않는다.

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());


  }

}
