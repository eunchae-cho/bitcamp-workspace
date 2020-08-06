package com.eomcs.ex03;

public class Exam0210 {

  static class A {

    static int v1; // 스태틱 변수 = static field = class field
    int v2;// 인스턴스 변수 = instance field = non-static field

    // static method
    static void m1() {
      System.out.println("m1()");
      A.v1 = 100;
      v1 = 200; // 같은 static멤버이기 때문에 클래스 이름 생략가능

      // 스태틱 메서드는 this라는 내장 변수가 없다
      //this.v2.200;
      // 내장 변수가 없기 때문에 인스턴스 변수는 접근할 수 없다.
      // v2 = 300;

      // 결론 : 스태틱 메소드는 this라는 내장변수가 없기 때문에
      // this를 사용하여 접근하는 인스턴스멤버(필드,메소드)를
      // 사용할 수 없다.
    }

    // non-static method
    void m2() {
      System.out.println("m2()");

      // 인스턴스 필드에 접근할 때는
      // 메서드 내장변수인 this를 사용하라
      // this는 메소드가 호출될 때 외부로부터 받은 인스턴스 주소를 갖고 있다.
      this.v2 = 100;
      v2 = 300; // this 생략 가능


      // 스태틱 필드는 인스턴스 레퍼런스를 통해 접근할 수 있다.
      // 하지만 비권장
      this.v1 = 100; // A.v1 = 100;

      //물론 다음과 같이 클래스 이름을 생략할 수 있다.
      // 반반
      v1 = 200; // A.v1 = 200;
      A.v1 = 300;
      m1();
      A.m1();
      // 인스턴스 메소드는 인스턴스 멤버(필드나 메소드)뿐만 아니라
      // 클래스 멤버도 사용할 수 있다.
      }

    static int abs(int value) {
      if (value < 0) {
        return value * -1;
      } else {
        return value;
      }
    }

  }

  public static void main(String[] args) {
    A.m1();

    // 인스턴스 메소드
    // 인스턴스 메소드는 인스턴스가 있어야만 호출 가능
    A obj1 = new A();
    obj1.m2();

    System.out.println(A.abs(100));
    System.out.println(A.abs(-100));
    System.out.println(A.abs(-100));
  }
}
