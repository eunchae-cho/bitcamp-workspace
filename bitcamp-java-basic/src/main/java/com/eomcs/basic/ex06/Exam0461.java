package com.eomcs.basic.ex06;
// for문과 컬렉션

import java.util.ArrayList;

public class Exam0461 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);

    for(Object value : list) {
      System.out.println(value);
    }

  }
}
