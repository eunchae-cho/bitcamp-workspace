package com.eomcs.oop.ex03;

public class Exam0120 {

  public static void main(String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float average;
    }

    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.average = s1.sum / 3f;

    s2.name = "임꺽정";
    s2.kor = 100;
    s2.eng = 100;
    s2.math = 100;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.average = s2.sum / 3f;

    s3.name = "유관순";
    s3.kor = 100;
    s3.eng = 90;
    s3.math = 60;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.average = s3.sum / 3f;

    System.out.printf("%s,%d,%d,%d,%d,%.1f\n",s1.name,s1.kor,s1.eng,s1.math,s1.sum,s1.average);
    System.out.printf("%s,%d,%d,%d,%d,%.1f\n",s2.name,s2.kor,s2.eng,s2.math,s2.sum,s2.average);
    System.out.printf("%s,%d,%d,%d,%d,%.1f\n",s3.name,s3.kor,s3.eng,s3.math,s3.sum,s3.average);

  }

}
