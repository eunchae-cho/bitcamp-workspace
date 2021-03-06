package com.eomcs.oop.ex03;
// 초기화 블럭

public class Exam0610 {

  static class A {

    static int x = 100; // 변수 초기화 문장
    static void m1() {}
    // static 변수 초기화 문장은 static 블록 앞부분에 삽입된다.
    int y = 100;
    // 인스턴스 변수 초기화 문장은 생성자 앞부분에 삽입된다.
    // static 초기화 블럭
    static {
      x = 200;
      // 클래스가 로딩되고
      // 스태틱 필드가 생성된 후
      // 스태틱 블럭을 순서대로 실행한다.
      // 정확한 내용
      // => static 블럭이 여러 개일 경우 컴파일 과정에서 여러개를 하나로 합친다.
      System.out.println("static 블럭 #1");
    }

    {
      y = 200;
      // 인스턴스 초기화 블럭
      // 인스턴스가 생성된 후
      // 인스턴스 블럭이 순서대로 실행된다.
      // 그런 후 생성자가 호출된다.
      // 정확한 내용
      // => 인스턴스 블록은 컴파일 과정에서 모든 생상자의 처음 부분에 삽입된다.
      System.out.println("인스턴스 블럭 #1");


    }

    public A() {
      y = 300;
      System.out.println("A(int) 생성자 호출됨");
    }

   {
      System.out.println("인스턴스 블럭 #2");

    }

    static {
      x = 300;
      System.out.println("static 블럭 #2");
    }


  static class B {
    static int x = 100;
    int y = 1000;

    static {
      x = 200;
    }

    public B() {
      y = 3000;
    }

    {
      y = 2000;
    }

  }


  }

  // main()을 비어놓고 하면 실행이 안된다
  // 왜냐면 클래스 로더가 로딩을 하지 않았기 때문


  public static void main(String[] args) {
    System.out.println("실행");
    A obj1; // 레퍼런스를 선언할 때는 클래스가 로딩되지 않는다.

    //A.x = 100; // static 멤버(필드, 메서드)를 사용할 때 로딩된다.
    //A.m1();     // 클래스 로딩은 한 번만 되기 때문에 위에서 한 번 로딩되면
                // 이 명령어를 실행시키지 않는다.

    System.out.println("--------------------");
    obj1 = new A();    // 인스턴스를 생성하기 전에 클래스가 로딩되지 않았다면 먼저 로딩한다.


    System.out.println(A.x);
    System.out.println(obj1.y);

    //new A(100);
  }
}
