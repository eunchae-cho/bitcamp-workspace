package com.eomcs.oop.ex03;

public class Exam0910 {

  static class Monitor {
    // 인스턴스 변수나 클래스 변수가 생성된면 0으로 자동 초기화가 된다.
    // byte, short, int, long = 0
    // float, double = 0.0
    // boolean = false
    // char = '\u0000'

    // 로컬 변수는 자동 초기화가 되지 않는다.

    int bright;
    int contrast;
    int widthRes;
    int heightRes;

    void display() {
      System.out.println("----------------------------");
      System.out.printf("밝기(%d)\n", this.bright);
      System.out.printf("명암(%d)\n", this.contrast);
      System.out.printf("해상도(%d x %d)\n", this.widthRes, this.heightRes);
      System.out.println("----------------------------");
    }
  }

  public static void main(String[] args) {
    // 모니터 인스턴스 생성
    Monitor m = new Monitor();
     m.display();

     m.bright = 50;
     m.contrast = 50;
     m.widthRes = 1920;
     m.heightRes = 1080;
     m.display();
  }

}
