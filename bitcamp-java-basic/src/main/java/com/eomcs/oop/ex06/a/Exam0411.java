package com.eomcs.oop.ex06.a;

public class Exam0411 {

  public static void printSedan(Sedan sedan) {
    System.out.printf("모델명: %s\n", sedan.model);
    System.out.printf("cc: %d\n", sedan.cc);
  }

  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    car1.model = "티코";
    car1.cc = 800;

    Truck car2 = new Truck();
    car2.model = "타이탄II";
    car2.cc = 10000;


    printSedan(car1);
    //printSedan(car2);
  }

}
