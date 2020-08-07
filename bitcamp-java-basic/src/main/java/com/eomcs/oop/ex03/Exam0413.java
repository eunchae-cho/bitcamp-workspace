package com.eomcs.oop.ex03;

public class Exam0413 {


  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;


    Score() {
      System.out.println("Score()");
    }

    Score(String name){
      System.out.println("Score(String)");
      this.name = name;
    }

    Score(String name, int kor, int eng, int math) {
      System.out.println("Score(String,int,int,int) 호출");

      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }

    public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s1 = new Score();

    Score s2 = new Score("홍길동");
    Score s3 = new Score("임꺽정", 80, 88, 87);
    // 논리값을 받는 생성자는 없다


    System.out.println(s1);
    System.out.println(s2.name);
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s3.name,s3.kor,s3.eng,s3.math,s3.sum,s3.aver);


  }

}
