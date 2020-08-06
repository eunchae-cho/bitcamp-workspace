package com.eomcs.ex03;
// 생산자

public class Exam422 {

  static class SmartPhone {

    int volume;
    int bright;
    int constrast;

    // 파라미터가 다른 생성자를 여러개 정의할 수 있다.
    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨!");
    }

    public SmartPhone(int a) {
      System.out.println("SmartPhone(int a) 생성자 호출됨!");
    }

    public SmartPhone(String str, int a) {
      System.out.println("SmartPhone(String str, int a) 생성자 호출됨!");
    }

    public SmartPhone(int a, String str) {
      System.out.println("SmartPhone(int a, String str) 생성자 호출됨!");
    }

  }

  public static void main(String[] args) {

    // 인스턴스를 생성할 때 생성자에 던지는 값에 따라
    // 자동으로 호출될 생성자가 결정된다.
    new SmartPhone();
    new SmartPhone(100);
    new SmartPhone("aaa",100);
    new SmartPhone(100,"aaa");


  }
}
