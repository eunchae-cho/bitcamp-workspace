package com.eomcs.oop.ex03;

public class Exam0930 {

  static class Monitor {

    int bright;
    int contrast;
    int widthRes;
    int heightRes;

    {   // 실무에서는 인스턴스 블록보다 생성자를 주로 사용한다.
      this.bright = 50;

      // 다음과 같이 인스턴스 필드에 값을 직접 대입하지 못하는 경우
      // 이렇게 인스턴스 초기화 블록에서 값을 설정하면 된다.
      // 값을 설정하는 것이 복잡할 경우 초기화 문장이 아닌 인스턴스 초기화 블록에서 수행한다.
      if (this.bright < 50)
        this.contrast = 70;
      else
        this.contrast = 40;

      this.widthRes = 1920;
      this.heightRes = 1080;
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
