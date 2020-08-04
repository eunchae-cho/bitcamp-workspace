package com.eomcs.basic.ex07;

public class Exam0415 {



  public static void main(String[] args) {
    int result = 1;
    int n = 5;

    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    System.out.println(result);
    System.out.println("--------------------------");

    result = factorial(5);
    // result = 5 * factorial(4)
    // result = 5 * 4 * factorial(3)
    // result = 5 * 4 * 3 * factorial(2)
    // result = 5 * 4 * 3 * 2 *factorial(1)
    // result = 5 * 4 * 3 * 2 * 1

    System.out.println(result);
  }
  // 재귀 호출
  // stack에 같은 로컬 변수가 계속 생기면서 쌓인다.
  static int factorial(int n) {
    if (n == 1) {       // 이 부분을 빠뜨리면 무한으로 간다. stack메모리가 꽉차서
      return 1;         // StackOverflowError가 생긴다.
    }
    return n * factorial(n-1);
  }
}
