package com.eomcs.corelib.ex01;
// toString()

public class Exam0120_test {

  static class My {

  }

  public static void main(String[] args) {

    My obj = new My();
    System.out.println(obj.toString());

    // 해시값 - 인스턴스마다 부여된 고유의 식별자
    // hashCode()를 재정의하지 않고 원래 메서드를 그대로 사용하면
    // 무조건 인스턴스마다 새 해시값이 부여된다.

    // println()에 넘겨주는 값이 String 타입이 아니라면
    // println()은 그 객체에 대해 toString() 호출한 후 그 리턴 값을 출력
    System.out.println(obj);

    My obj2 = new My();
    My obj3 = new My();

    System.out.println(obj2 == obj3);
    System.out.println(obj2.toString());
    System.out.println(obj3.toString());
  }

}
