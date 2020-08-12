package com.eomcs.oop.ex07.a;


class Score4 {

  // 필드
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;

  // 프로퍼티 (게터와 세터)
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getKor() {
    return this.kor;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getEng() {
    return this.eng;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getMath() {
    return this.math;
  }

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

public class Exam0311 {
  public static void main(String[] args) {
    Score4 s = new Score4();
    s.setName("홍길동");
    s.setKor(100);
    s.setEng(90);
    s.setMath(80);
    s.compute();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s.getName(),
        s.getKor(),s.getEng(),s.getMath(),
        s.getSum(), s.getAver());
  }

}
