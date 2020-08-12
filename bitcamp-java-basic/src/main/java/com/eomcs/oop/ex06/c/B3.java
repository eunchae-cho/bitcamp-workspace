package com.eomcs.oop.ex06.c;

public class B3 extends B{

// 오버라이딩을 하려고 했는데 오버로딩이 될 수도 있으니
// Annotation문법인 @Override를 사용하여 JVM에게 검사를 요청한다
  @Override
  void m(int x) {
    System.out.println("B3의 m()");
  }

}
