package com.eomcs.basic.ex06;
// for문과 컬렉션

import java.util.ArrayList;
import java.util.Date;

public class Exam0461 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);
    list.add('헐');
    list.add(new Date());

    for(Object value : list) {
      System.out.println(value);
    }

  }
}
