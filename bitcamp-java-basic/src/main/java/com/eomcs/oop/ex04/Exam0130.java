package com.eomcs.oop.ex04;
// 생성자 활용2
import java.util.Calendar;

public class Exam0130 {
  public static void main(String[] args) throws Exception {


    // 생성자가 있더라도 접근 권한이 없다면 생성자를 호출할 수 없다.
    // 이런 경우 new 명령으로 인스턴스를 생성할 수 없다.
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    System.out.println(c1 == c2);
    // getInstance() 호출 시점이 다르기 때문에 두 객체의 주소는 다르다.
  }
}
