package com.eomcs.corelib.ex02;

public class Exam0222_test {
  public static void main(String[] args) {

    Integer obj = Integer.valueOf(300);
    int i = obj; // => obj.intValue();
    // obj의 인스턴스 주소가 저장되는 것이 아니라
    // obj 인스턴스에 들어있는 값을 꺼내 i에 저장되는 것이다.
  }

}
