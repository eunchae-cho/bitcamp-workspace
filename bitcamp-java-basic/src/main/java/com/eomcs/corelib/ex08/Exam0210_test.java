package com.eomcs.corelib.ex08;

import java.util.HashMap;
import java.util.Iterator;

public class Exam0210_test {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("윤봉길", 25);

    HashMap map = new HashMap();

    map.put("s01", v1);
    map.put("s02", v2);
    map.put("s03", v3);
    map.put("s04", v4);
    map.put("s05", v5);

    // HashMap에서 key목록 꺼내기
    // key 객체들이 들어있는 집합
    java.util.Set keys = map.keySet();


    // 1. Iterator
    Iterator iterator = keys.iterator();
    while (iterator.hasNext()) {
      Object key = iterator.next();
      System.out.println(map.get(key));
    }
    System.out.println("-----------------------");


    // 2. 배열
    Object[] keyArray = keys.toArray();
    for (Object key : keyArray) {
      System.out.println(map.get(key));
    }
    System.out.println("-----------------------");


    // 3. 컬렉션 객체가 java.util.Collection 규칙을 따라 만든 클래스라면
    //    for (:)
    for (Object key : keys) {
      System.out.println(map.get(key));
  }
  System.out.println("-----------------------");
  }


}
