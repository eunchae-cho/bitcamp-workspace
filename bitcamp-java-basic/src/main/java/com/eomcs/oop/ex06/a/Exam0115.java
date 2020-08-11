package com.eomcs.oop.ex06.a;

public class Exam0115 {


  public static void main(String[] args) {

    Car c = new Sedan();

    c.model = "티코";
    c.capacity = 5;
    c.cc = 890;
    c.valve = 16;

    // 컴파일 오류 - 레퍼런스가 실제 하위 인스턴스를 가리키고 있다고 해도
    // 레퍼런스 타입의 범위를 벗어나서 사용할 수 없다.
    //c.sunroof = true;
    //c.auto = true;

    // 자바 컴파일러는 레퍼런스가 실제 어떤 인스턴스를 가리키는지 따지지 않고
    // 레퍼런스의 타입에 한정하여 인스턴스나 클래스의 멤버 사용을 허락한다.

    // 해결책
    // 레퍼런스 변수가 실제 가리키는 것이 무엇인지 알려줘야 한다.
    // ((원래 레퍼런스타입) 레퍼런스).멤버
    ((Sedan)c).sunroof = true;
    ((Sedan)c).auto = true;
    // or
    Sedan s = (Sedan)c;
    s.sunroof = true;
    s.auto = true;



  }
}
