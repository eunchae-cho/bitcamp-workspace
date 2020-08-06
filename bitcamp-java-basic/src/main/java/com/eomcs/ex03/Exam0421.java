package com.eomcs.ex03;
// 생산자

public class Exam0421 {

  static class SmartPhone {

    int volume;
    int bright;
    int constrast;

    // 생성자가 한 개라도 있으면 기본 생성자가 자동으로 생성되지 않는다.
    public SmartPhone(int a) {
      System.out.println("SmartPhone(int a) 생성자 호출됨!");
    }

  }

  public static void main(String[] args) {

    //SmartPhone obj1 = new SmartPhone(); 컴파일 오류
    SmartPhone obj1 = new SmartPhone(100);
    //SmartPhone obj2 = new SmartPhone(3.14); 컴파일 오류


    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.constrast);

  }
}
