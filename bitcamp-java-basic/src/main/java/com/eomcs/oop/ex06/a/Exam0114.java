package com.eomcs.oop.ex06.a;

public class Exam0114 {


  public static void main(String[] args) {

    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Car c2 = null;

    // 부모클래스가 자신의 여러 다른 자식클래스를 가리킬 수 있다.
    c2 = s;
    c2 = t;

    v.model = "벤츠 S클래스";
    v.capacity = 6;

    c2 = s;
    c2.model = "티코"; // Vehicle의 인스턴스 변수
    c2.capacity = 5;  // Vehicle의 인스턴스 변수
    c2.cc = 890;      // Car의 인스턴스 변수
    c2.valve = 16;    // Car의 인스턴스 변수

    System.out.printf("%s, %d, %d, %d\n",c2.model,
        c2.capacity,c2.cc,c2.valve);

  }
}
