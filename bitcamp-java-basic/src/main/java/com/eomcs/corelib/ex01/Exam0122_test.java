package com.eomcs.corelib.ex01;

public class Exam0122_test {
  // java.lang.Object
  // 수퍼 클래스를 지정하지 않으면 기본으로 java.lang.Object 클래스가
  // 수퍼 클래스가 된다.
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);
    String str = s.toString();
    System.out.println(str);
    System.out.println(s.toString());
  }

}
