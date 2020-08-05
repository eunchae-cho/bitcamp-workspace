package com.eomcs.util;

// 별도 class로 분리시킬 때는 static을 붙이지 않는다.
public class Calculate {

  // result변수는 각 계산마다 개별적으로 관리해야 한다.
  // => non-static 변수로 선언해라
  // => non-static 변수는 new연산자를 통해서만 만들 수 있다.
  // => non-static 변수는 heap영역에 생성된다.

  public int result = 0;

  // static method는 non-static 변수를 사용할 수 없다.
  // 사용하려면 new 명령을 통해 생성된 메모리의 주소를 알아야 한다.

  // non-static 메소드 = 인스턴스 메소드는
  // 인스턴스 주소를 받는 this라는 빌드인 변수가 있다.
  public void plus(int value) {
    this.result += value;
  }

  public void minus(int value) {
    this.result -= value;
  }

  public void multiple(int value) {
    this.result *= value;
  }

  public void divide(int value) {
    this.result /= value;
 }

}