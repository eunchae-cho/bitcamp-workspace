package com.eomcs.corelib.ex08;

public class Member {
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Member [name=" + name + ", age=" + age + "]";
  }

}
