package com.eomcs.oop.ex06.c;

public class C2 extends C{

  // 오버라이드 불가
  // C2 클래스의 새로운 m1() 메서드가 생성
  private void m1() {}


  @Override void m2() {}
  @Override protected void m3() {}
  @Override public void m4() {}

}
