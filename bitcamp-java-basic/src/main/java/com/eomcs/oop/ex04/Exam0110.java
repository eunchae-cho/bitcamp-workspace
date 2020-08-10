package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0110 {
  public static void main(String[] args) throws Exception {

    String s1 = new String();   // 빈 문자열
    System.out.println(" => "+s1);

    String s2 = new String("Hello!");
    System.out.println(" => "+s2);

    char[] chars = new char[] {'H','e','l','l','o','!','2'};
    String s3 = new String(chars);
    System.out.println(" => "+s3);

    byte[] bytes = new byte[] {
        0x41, //A => 0041
        0x42, //B => 0042
        (byte)0xEA, //가 ==> AC00
        (byte)0xB0,
        (byte)0x80,
        (byte)0xEA, //나 ==> AC01
        (byte)0xB0,
        (byte)0x81
    };
    String s4 = new String(bytes,"UTF-8");
    System.out.println(" => "+s4);


    byte[] bytes2 = new byte[] {
        0x41, //A => 0041
        0x42, //B => 0042
        (byte)0xB0, // 가 ==>AC00
        (byte)0xA1,
        (byte)0xB0, // 각 ==> AC01
        (byte)0xA2,
        (byte)0xB6, // 똘 ==> EUC-KR
        (byte)0xCA,
        (byte)0x8C, // 똠 ==> MS949/CP949
        (byte)0x63,
        (byte)0xB6, // 똥 ==> EUC-KR
        (byte)0xCB
    };  // 네트워크는 기본이 바이트 배열
    String s5 = new String(bytes2,"MS949"); // MS949(11172자) = EUC-KR(2350자)
    System.out.println(" => "+s5);

    Date d1 = new Date();   // 현재 실행하는 시점의 시분초로 초기화시킨다.
    System.out.println(d1.toString());
    System.out.println(d1); // 아규먼트가 primitive type  이나 String 타입이 아니면
                            // 인스턴스에 대해서 toString()을 호출하여 그 리턴 값을 호출한다.
                            // 따라서 d1.toString()과 같다.
    // 모든 클래스에서 toString()을 호출할 수 있다.

    int[] arr = new int[] {100, 200, 300};
    System.out.println(arr.toString());
    System.out.println(arr); // [I@119d7047 해쉬코드 : 인스턴스를 구분할 때 (메모리 주소X)


    int a = 100;
    System.out.println(a);

    Date d2 = new Date(100000); //100초 에초 만들어진 시간이 1970년 1월 1일
    System.out.println(d2);


    Date d3 = new Date(120,8,10);
    System.out.println(d3);

    // 클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
    // 이런 클래스의 인스턴스 만들려면 보통 2가지 방법을 사용한다.
    // 1) 다른 클래스의 도움을 받는다
    // 2) 해당클래스에서 제공하는 클래스 메소드(스태틱 메소드)를 사용한다'
    // 왜? 생성자를 여러개 만들고 싶지 않기 때문

    //Calendar c1 = new Calendar();
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1); // c1.toString()으로 출력되고 리턴값을 출력한다.

    Car car1 = new Car();
    Car car2 = new Car();
    System.out.println(car1==car2);
    car1.model = "티코";
    car1.cc = 980;
    car2.model = "소나타";
    car2.cc = 1980;
    System.out.println(car1.model);
    System.out.println(car2.model);

    Car2 car3 = Car2.getInstance(); // 같은 달력을 여러개 못 만들도록
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4);
    car3.model = "비트카";
    System.out.println(car4.model);
  }
}


class Car { // 패키지 맴버 클래스
  String model;
  int cc;
}

class Car2 {

  String model;
  int cc;
  static Car2 obj;

  private Car2(){}

  static Car2 getInstance() {
    // 보통 생성자를 private으로 막는 경우는
    // 인스턴스를 한 개만 생성하도록 제한하고 주로 싶을 때이다.
    if (obj == null) {
      obj = new Car2();
    }
    return obj;
  }
}

// UTF-8? UCS2(UTF-16) ==> UTF-8
// 비트암호
// 문자 --> 암호
// A --> 1
// B --> 2
// C --> 3
// 가 --> 100
// 각 --> 101

//
// 로컬 변수는 항상 초기화해야 한다.
// 주소가 들어있어야 한다.