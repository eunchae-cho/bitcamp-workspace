package com.eomcs.corelib.ex07;

import java.util.HashSet;

public class Exam0310_test {

  static class Member {
    String name;
    int age;


    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }


    @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + "]";
    }

  }

  public static void main(String[] args) {
    Member v1 = new Member("홍길동",20);
    Member v2 = new Member("임꺽정",30);
    Member v3 = new Member("유관순",16);
    Member v4 = new Member("안중근",20);
    Member v5 = new Member("유관순",16);

    HashSet set = new HashSet();
    set.add(v1);
    set.add(v2);
    set.add(v3);
    set.add(v4);
    set.add(v5);
    print(set);

    // 중복 저장됨
    // 이유 : hashCode()와 equals()를 오버라이딩하지 않았기 때문

  }

  static void print(HashSet set) {
    Object[] arr = set.toArray();
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]+",");
    }
    System.out.println();
  }



}
