package com.eomcs.oop.ex07.b;

import java.util.Calendar;

public class Exam0230 {
  public static void main(String[] args) {
    // java.util.Calendar 객체 만들기
    // 생성자가 protected로 되어 있다.
    // 보통 개발자가 클래스를 만들 때는 자신만의 패키지에 넣어서 만든다
    // java.util 피키지를 자신의 클래스에 두기 위해 사용하지는 않을 것이다
    // 따라서 Calendar 생성자가 protected로 되어 있다는 것은
    // 개발자가 직접 생성자를 호출하지 말라는 의미이다
    // 물론 Calendar를 직접 사용하겠다는 의도로 생성자를 protected 했음을 알 수 있다.
    // 개발자들이 이 클래스의 인스턴스를 만들 수 있도록 스태틱 메서드를 제공


    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    System.out.println(cal1 == cal2);
  }

}
