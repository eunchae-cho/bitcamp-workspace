package com.eomcs.oop.ex05.c;

public class Car2 extends Car {
  boolean sunroof;
  boolean auto;


  public Car2() {

  }

  public Car2(String model, String maker, int capacity) {
    super(model, maker, capacity);
  }


  public Car2(boolean sunroof, boolean auto) {
    this.sunroof = sunroof;
    this.auto = auto;
  }

  public Car2(String model, String maker, int capacity, boolean sunroof, boolean auto) {
    super(model, maker, capacity);
    this.sunroof = sunroof;
    this.auto = auto;
  }

}
