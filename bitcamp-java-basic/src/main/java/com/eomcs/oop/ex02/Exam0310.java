package com.eomcs.oop.ex02;
// 클래스 분리 연습

public class Exam0310 {

  public static void main(String[] args) {

    String name = "홍길동";
    int kor = 85;
    int eng = 92;
    int math = 90;
    int bio = 74;
    int korHis = 98;
    int sum = kor + eng + math + bio + korHis;
    float aver = sum / 5f;

    printScore(name,kor,eng,math,bio,korHis,sum,aver);
  }

  static void printScore(String name, int kor, int eng, int math,
      int bio, int korHis,int sum, float aver) {
    System.out.printf("%s, %d, %d, %d, %d, %d, %d, %.1f",
        name,kor,eng,math,bio,korHis,sum,aver);
  }
}
