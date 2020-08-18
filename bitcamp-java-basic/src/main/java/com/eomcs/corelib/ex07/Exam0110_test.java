package com.eomcs.corelib.ex07;

import java.util.HashSet;

// HashSet
// Set = 집합
// index 이용 불가
// 중복 저장 불가
// 중복 여부 판단 : hashCode() 리턴값 같고 equals()검사 true => 둘다 오버라이딩
// 값 뒤죽박죽 저장 - 4로 나눈 나머지가 같은 값끼리 저장

public class Exam0110_test {
  public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("ccc");

    HashSet set = new HashSet();
    set.add(v1);
    set.add(v2);
    set.add(v3);
    set.add(v4);
    set.add(v5);

    System.out.println(v3 == v5);
    System.out.println(v3.equals(v5));
    System.out.println(v3.hashCode()+","+v5.hashCode());
    System.out.println("---------------------");
    print(set);
  }

  static void print(HashSet set) {
    Object[] values = set.toArray();
    for (Object value : values) {
      System.out.print((value+","));
    }
    System.out.println();
  }
}
