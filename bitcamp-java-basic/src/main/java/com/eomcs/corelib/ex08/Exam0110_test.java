package com.eomcs.corelib.ex08;

import java.util.HashMap;

public class Exam0110_test {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("유관순", 16);

    HashMap map = new HashMap();
    map.put("s01", v1);
    map.put("s02", v2);
    map.put("s03", v3);
    map.put("s04", v4);

    // 이전에 저장할 때 사용한 같은 키로 다른 값을 저장하면 기존값 덮어씀
    map.put("s04", v5);

    System.out.println(map.get("s01"));
    System.out.println(map.get("s02"));
    System.out.println(map.get("s03"));
    System.out.println(map.get("s04"));
// 존재하지 않은 key를 지정하면 null을 리턴
    System.out.println(map.get("s05"));



  }
}
