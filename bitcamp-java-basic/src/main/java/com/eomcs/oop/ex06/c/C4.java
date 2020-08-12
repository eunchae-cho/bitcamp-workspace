package com.eomcs.oop.ex06.c;

public class C4 {

  // 원본 메서드보다 접근 범위를 축소할 수는 없다.
  @Override private void m2() {}
  @Override void m3() {}
  @Override protected void m4() {}
}
