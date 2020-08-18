package com.eomcs.corelib.ex07;
// HashSet 값 꺼내는 방법

import java.util.HashSet;
import java.util.Iterator;

public class Exam0210_test {
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

    // 1. 배열
    Object[] arr = set.toArray();
    for ( Object value : arr ) {
      System.out.print(value+",");
    }
    System.out.println();

    // 2. 전달자의 도움 = 값을 꺼내는 객체의 도움
    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      System.out.print(iterator.next()+",");
    }
    System.out.println();

  }

}
