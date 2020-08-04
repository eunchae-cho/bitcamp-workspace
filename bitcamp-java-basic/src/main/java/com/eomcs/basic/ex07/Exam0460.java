package com.eomcs.basic.ex07;
// 스택 오버플로우 오류



// 재귀 호출은 한 스택이 반복되는 것이 아니라 계속 쌓아는 것이다
// 숫자가 커지면 JVM 스택 메모리가 꽉 차서 더이상 메소드 실행을 위해
// 로컬 변수를 만들 수 없는 상태이다.


public class Exam0460 {

  static int sum(int value) {
    if (value == 1) {
      return 1;
    }
    return value + sum(value - 1);
  }

  public static void main(String[] args) {
    System.out.println(sum(100000));
  }
}
