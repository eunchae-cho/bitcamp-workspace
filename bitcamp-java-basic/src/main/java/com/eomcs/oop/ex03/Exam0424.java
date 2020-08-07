package com.eomcs.oop.ex03;
// 생산자

//public 파일은 반드시 소스파일(클래스파일)명과 같아야 한다.
public class Exam0424 {

  public static void main(String[] args) {

    // private으로 접근을 제한한 경우 다른 클래스가 생성자를 지정할 수 없다.
    //SmartPhone obj1 = SmartPhone();
    SmartPhone obj2 = SmartPhone(50);

  }
}


 class SmartPhone {

  int volume;
  int bright;
  int contrast;


  private SmartPhone() {
    System.out.println("SmartPhone() 생성자 호출됨!");
  }

  public SmartPhone(int volume) {
    System.out.println("SmartPhone(int volume) 생성자 호출됨!");
    this.volume = volume;
    this.bright = 50;
    this.contrast = 50;
  }

  private SmartPhone(int volume, int bright) {
    System.out.println("SmartPhone(int volume, int bright) 생성자 호출됨!");
    this.volume = volume;
    this.bright = bright;
    this.contrast = 50;
  }

  private SmartPhone(int volume, int bright, int contrast) {
    System.out.println("SmartPhone(int volume, int bright, int contrast) 생성자 호출됨!");
    this.volume = volume;
    this.bright = bright;
    this.contrast = contrast;
  }

  void m1() {
    // 일반 메소드에서 생산자를 임의로 호출할 수 없다.
    // this();
  }

}