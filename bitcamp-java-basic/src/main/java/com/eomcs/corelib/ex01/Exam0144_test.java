package com.eomcs.corelib.ex01;

public class Exam0144_test {

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

    @Override
    public int hashCode() {
      return 1000; // 무조건 모든 Score 인스턴스 같은 해시코드를 갖게 한다.
    }
  }

  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = new Score("홍길동", 100, 100, 100);
    Score s3 = new Score("임꺽정", 90, 80, 70);

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());

  }

  // 해시코드
  // 데이터를 식별할 때 사용하는 고유 아이디
  // 보통 계산해서 나온 정수값
  // = 디지털 지문

  // 인스턴스가 다르더라도 같은 데이터를 갖는 경우 같은 것으로
  // 취급하기 위해 오버라이딩을 통해서 메서드를 재정의한다.


}
