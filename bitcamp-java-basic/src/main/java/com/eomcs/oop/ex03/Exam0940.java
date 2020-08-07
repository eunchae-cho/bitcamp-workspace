package com.eomcs.oop.ex03;

public class Exam0940 {

  static class Monitor {

    int bright = 10;
    int contrast = 10;
    int widthRes = 480;
    int heightRes = 320;

    {
      System.out.println("인스턴스 초기화 블록 실행");
      bright = 20;
      contrast = 20;
      widthRes = 800;
      heightRes = 600;
    }

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

     m.bright = 40;
     m.display();
  }

}
