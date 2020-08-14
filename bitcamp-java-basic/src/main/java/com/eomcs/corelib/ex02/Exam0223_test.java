package com.eomcs.corelib.ex02;

public class Exam0223_test {

  static class Member {
    String name;
    String tel;

    @Override
    public String toString() {
      return name +"," + tel;

    }
  }

  public static void main(String[] args) {

    int i = 100;
    Member m = new Member();
    m.name = "홍길동";
    m.tel = "010-1212-3434";

    String str = new String("Hello");

    Object obj;
    obj = m;
    obj = str;
    obj = i; // auto-boxing => Integer.valueOf(i)문장으로 변환

    Integer obj2 = (Integer) obj;

    System.out.println(i);
    System.out.println(obj);
  }

}
