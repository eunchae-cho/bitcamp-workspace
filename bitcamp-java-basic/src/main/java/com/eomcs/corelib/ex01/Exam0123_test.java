package com.eomcs.corelib.ex01;

public class Exam0123_test {

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
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }
    // Object로부터 받은 toString()이 마음에 들지 않는다면 재정의
    // 인스턴스 내부 데이터를 문자열로 리턴
    // 인스턴스 내부 값을 빠르게 확인하고 싶을 때 toString() 오버라이딩 사용
    @Override
    public String toString() {
      return String.format("%s, %d, %d, %d, %d, %.1f\n",
          this.name,this.kor,this.eng,this.math,this.sum,this.aver);

    }

    public static void main(String[] args) {
      Score s = new Score("홍길동", 100, 100, 100);
      String str = s.toString();
      System.out.println(str);
      System.out.println(s);
    }

  }

}
