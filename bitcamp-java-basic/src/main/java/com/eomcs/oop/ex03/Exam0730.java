package com.eomcs.oop.ex03;

public class Exam0730 {

  static class A {
    int a;
    int b;
    int c;

    {
      a = 100;
      System.out.println("hello");
    }

    A() {
      // 여러개의 생성자가 있으면
      // 존재하는 모든 생성자의 앞 부분에 삽입된다.
      // 자바 컴파일러는 필드 초기화나 인스턴스 초기화 블록이 있으면
      // 선언된 순서대로 모든 생성자의 첫 부분에 복사한다.
      System.out.println("A()");
      b = 200;
      c = 300;
    }

    A(int b){
      System.out.println("A(int)");
      this.b = b;
      c = 300;
    }


    A(int b, int c){
      System.out.println("A(int, int)");
      this.b = b;
      this.c = c;
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n",obj1.a,obj1.b,obj1.c);
    System.out.println("-----------------------");
    A obj2 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n",obj2.a,obj2.b,obj2.c);
    System.out.println("-----------------------");
    A obj3 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n",obj3.a,obj3.b,obj3.c);
    System.out.println("-----------------------");

  }
}
