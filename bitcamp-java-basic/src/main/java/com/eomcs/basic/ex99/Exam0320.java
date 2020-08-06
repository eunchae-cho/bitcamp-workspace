package com.eomcs.basic.ex99;

import java.util.Scanner;

public class Exam0320 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
    }

  void printResult() {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",name,kor,eng,math,sum,aver);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("성적 데이터를 입력하세요(예: 홍길동 100 100 100)");
    System.out.print(">");
    Score s1 = new Score();
    s1.name = sc.next();
    s1.kor = sc.nextInt();
    s1.eng = sc.nextInt();
    s1.math = sc.nextInt();

    System.out.println("성적 데이터를 입력하세요(예 홍길동 100 100 100");
    System.out.print(">");
    Score s2 = new Score();
    s2.name = sc.next();
    s2.kor = sc.nextInt();
    s2.eng = sc.nextInt();
    s2.math = sc.nextInt();

    s1.compute();
    s2.compute();

    s1.printResult();
    s2.printResult();

  }
}
