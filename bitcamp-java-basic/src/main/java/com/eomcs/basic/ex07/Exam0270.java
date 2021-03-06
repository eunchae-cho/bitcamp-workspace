package com.eomcs.basic.ex07;
// 가변 파라미터 단점

public class Exam0270 {


  // 1) 가변 파라미터는 여러개 선언할 수 없다.
  // 아규면트의 시작과 끝을 구분할 수 없다.
  // 예) m1("aaa","bbb","aaa@test.com","bbb@test.com");
  // 어느 값이 names의 배열에 들어가고, 어느 값이 emails 배열에 들어가는가
  // static void m1(String... names, String... emails){} //컴파일 오류
  // 중간에 다른 타입이 온다 하더라도 안된다.


  // 2) 가변 파라미터는 반드시 맨 끝에 와야 한다.
  // 아규먼트의 시작과 끝을 구분할 수 없다.


  // 결론
  // 메서드에 가변 파라미터는 한 개만 사용할 수 있다.
  // 가변 파라미터는 반드시 맨 뒤에 와야 한다.
  // 그 이유는 복잡한 사용을 막기 위해

}
