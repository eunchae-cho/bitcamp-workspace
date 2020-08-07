package com.eomcs.oop.ex03;
// 생산자

public class Exam0420 {

  static class SmartPhone {

    int volume;
    int bright;
    int constrast;

    // 다음과 같이 직접 생성자를 정의할 수 있다.
    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨!");
    }

  }

  public static void main(String[] args) {

    SmartPhone obj1 = new SmartPhone();

    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.constrast);

  }
}

