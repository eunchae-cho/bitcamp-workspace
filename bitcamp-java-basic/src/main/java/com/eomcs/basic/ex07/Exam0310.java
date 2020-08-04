package com.eomcs.basic.ex07;
// call by value (값을 호출) , call by reference (번지수를 호출)

public class Exam0310 {

  // 만약 변수값을 호출하고 싶은데 자바는 불가능 하니
  // 새로운 종류의 메모리를 선언
  // = 클래스를 정의한다.
  // = 새 데이터 타입을 선언
  // = 새 데이터 타입 설계
  static class Person {
    String name;
    int age;
    boolean working;
  }

  static void m3(Person p) {
    p.name = "홍길동";
    p.age = 20;
    p.working = true;
  }

  public static void main(String[] args) {
    int a = 200;

    m1(a);  // call by value
    System.out.println(a);

    // 메소드 호출하고 메소드 끝나면 사라짐
    // 자바에서는 주소를 넘길 방법이 없음 & 연산자가 없다
    // 대신 배열을 넘길 수 있다
    // primitive 타입은 주소값을 넘길 수 없다

    int[] arr = new int[3];
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;

    m2(arr);    // call by reference
                // 배열을 담고 있는 변수 메소드
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    Person p;
    p = new Person();   // null로 자동 초기화 된다.
    System.out.printf("%s, %d, %b\n",p.name,p.age,p.working);

    m3(p);      // call by reference
    System.out.printf("%s, %d, %b\n",p.name,p.age,p.working);
  }

  static void m1(int a) {
    a = 100;
  }

  // new 명령으로 생성하는 모든 변수는 HEAP이라는 곳에 있다.
  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;
  }

}

// 시험지 :
// 1. 다음 계산을 수행하라.
//      a. 변수에 100을 넣어라.
//      b. 변수에 200을 넣어라.
//      a와 b를 더해 그 결과를 출력하라.