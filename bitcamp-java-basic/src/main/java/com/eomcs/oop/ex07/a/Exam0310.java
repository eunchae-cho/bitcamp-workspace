package com.eomcs.oop.ex07.a;


class Score3 {
  String name;
  private int kor;
  private int eng;
  private int math;

  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }

  public int getKor() {
    return this.kor;
  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }

  public int getEng() {
    return this.eng;
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }

  public int getMath() {
    return this.math;
  }

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
public class Exam0310 {
  public static void main(String[] args) {
    Score3 s = new Score3();

    s.name = "홍길동";
    s.setKor(100);
    s.setEng(90);
    s.setMath(80);

    s.setKor(90);
    s.setEng(88);
    s.setMath(60);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.name,
        s.getKor(),s.getEng(),s.getMath(),
        s.getSum(),s.getAver());
  }

}
