package com.eomcs.oop.ex07.a;

// 값을 연산한 결과를 보관하기 때문에 직접 접근하여 값을 변경하는 것을
// 허용해서는 안된다. 허용한다면 잘못된 개발자의 명령으로 올바르게 계산되지 않을 수 있다.
// 그래서 자바는 필드나 메서드의 외부 접근 범위를 조정하는 문법을 제공한다.

class Score2 {
  String name;
  int kor;
  int eng;
  int math;
  private int sum;
  private float aver;

  public int getSum() {
    return this.sum;
  }

  public float getAver() {
    return this.aver;
  }

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam0210 {
  public static void main(String[] args) {
    Score2 s = new Score2();

    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    s.compute();

    // 임의로 합계나 평균을 변경할 수 없다.
//    s.sum= 300;
//    s.aver = 100f;

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name,s.kor,s.eng,s.math,s.getSum(),s.getAver());

  }

}
