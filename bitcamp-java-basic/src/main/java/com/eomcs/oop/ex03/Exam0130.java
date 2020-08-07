package com.eomcs.oop.ex03;

public class Exam0130 {

  //스태틱 변수
  static class A {
    // static field = class variables
    static int v1;
    static boolean v2;
  }
  //메소드 안에서는 static을 붙일 수 없다.
  public static void main(String[] args) {


    // 객체 레퍼런스
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    // 레퍼런스.변수명 = 100;
    // - 레퍼런스가 가리키는 인스턴스에서 해당 변수를 찾아 값을 넣는다.
    // - 클래스 변수를 찾아 값을 넣는다.
    // - 레퍼런스 다음에 지정한 변수가 인스턴스 변수가 아니라
    //   클래스 변수라면 컴파일러가 컴파일하는 과정에 정확하게 클래스 변수를
    //   가리키도록 기계어로 바꾼다.
    // - 즉 개발자가 레퍼런스를 통해 클래스 변수를 지정하더라도 컴파일러가
    //   클래스 변수로 인식하여 클래스 변수를 사용하는 코드로 변환한다.
    A.v1 = 100; // => A.v1 = 100;
    A.v1 = 200; // => A.v1 = 200;
    //obj3.v1 = 300;
    // 클래스 변수를 레퍼런스를 이용해 사용하면 안된다.

    System.out.println(A.v1);
    System.out.println(A.v1);

  }
}

