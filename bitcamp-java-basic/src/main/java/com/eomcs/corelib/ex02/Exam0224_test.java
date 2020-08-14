package com.eomcs.corelib.ex02;

public class Exam0224_test {

  static class Member {
    String name;
    String tel;

    @Override
    public String toString() {
      return name + "," + tel;
    }
  }

  static void print(int i) {
    System.out.print("정수: ");
    System.out.println(i);
  }

  static void print(Member m) {
    System.out.print("회원: ");
    System.out.println(m);
  }

  static void printObject(Object obj) {
    System.out.println(obj);
  }

  public static void main(String[] args) {

    print(100);
    print(new Member());
    printObject(100);
    printObject(new Member());
  }

}
