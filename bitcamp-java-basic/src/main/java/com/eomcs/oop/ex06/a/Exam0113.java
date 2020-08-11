package com.eomcs.oop.ex06.a;

public class Exam0113 {


  public static void main(String[] args) {

    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Bike b2 = null;

    // 다른 자식 클래스의 인스턴스도 가리킬 수 없다.
    //b2 = c;
    //b2 = s;
    //b2 = t;
  }
}
