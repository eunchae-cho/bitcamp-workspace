package com.eomcs.corelib.ex01;

public class Exam0145_test {
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
      // String클래스에 있는 hashCode()를 사용
      String value = String.format("%s, %d, %d, %d, %d, %.1f",
          this.name, this.kor, this.eng, this.math,
          this.sum, this.aver);
      // 데이터가 같으면 문자열이 같을 것이고
      // 문자열이 같으면 해시코드의 리턴 값도 같을 것이다.
      return value.hashCode();
    }

    public static void main(String[] args) {
      Score s1 = new Score("홍길동", 100, 100, 100);
      Score s2= new Score("홍길동", 100, 100, 100);
      Score s3 = new Score("홍길동", 100, 100, 99);
      Score s4 = new Score("홍길동", 99, 100, 100);

      System.out.println(s1 == s2);
      System.out.println(s1 == s3);
      System.out.println(s1 == s4);
      System.out.println(s2 == s3);
      System.out.println(s2 == s4);
      System.out.println(s3 == s4);

      System.out.println();

      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s3.hashCode());
      System.out.println(s4.hashCode());

    }

  }

}
