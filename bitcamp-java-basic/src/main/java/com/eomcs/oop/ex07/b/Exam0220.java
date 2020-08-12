package com.eomcs.oop.ex07.b;


public class Exam0220 {

  public static void main(String[] args) {
    // 생산자가 private라 호출 불가능
    //Car c = new Car();

    // 개발자가 직접 인스턴스를 생성하면 복잡하니
  // 다른 메서드를 통해 인스턴스를 생성하라는 의미

  Car c = Car.create("티코");
  System.out.printf("%s,%s,%d,%d\n",
      c.model, c.maker, c.cc, c.valve);

  }



}
