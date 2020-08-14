package com.eomcs.corelib.ex02;

public class Exam0211_test {
  public static void main(String[] args) {

    Integer i1 = new Integer(127);
    Integer i2 = new Integer(127);
    System.out.println((i1 == i2));

    Integer i3 = Integer.valueOf(127);
    Integer i4 = Integer.valueOf(127);
    System.out.println(i3 == i4);
    System.out.println(i1 == i3);

    Integer x = Integer.valueOf(-128);
    Integer y = Integer.valueOf(-128);
    System.out.println(x == y);

    // Integer -128~127 범위 이외의 수는 무조건 새 인스턴스를 생성
    // 다루는 숫자가 너무 많기 때문에 무조건 상수풀에 만들기에는
    // 오해려 메모리 낭비가 심하기 때문
    Integer i5 = Integer.valueOf(128);
    Integer i6 = Integer.valueOf(128);
    System.out.println(i5 == i6);
    //equals()를 사용해서 값을 비교하는 것이 낫다...
    System.out.println(i5.equals(i6));


  }

}
