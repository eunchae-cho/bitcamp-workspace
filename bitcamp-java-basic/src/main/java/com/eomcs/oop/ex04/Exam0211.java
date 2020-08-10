package com.eomcs.oop.ex04;

public class Exam0211 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");

    // 이 메소드를 호출하려면 반드시 String 인스턴스 주소를 줘야 함
    char c = s1.charAt(1);
    System.out.println(c);

    System.out.println(s1.compareTo("Helli"));
    System.out.println(s1.compareTo("Hello"));
    System.out.println(s1.compareTo("Hellu"));

    System.out.println(s1.contains("ll"));
    System.out.println(s1.contains("ee"));

    String s2 = s1.concat(", world!");
    System.out.println(s1);
    System.out.println(s2); // 새로운 문자열

    System.out.println(s1.equals("aaa"));
    System.out.println(s1.equals("Hello"));

    String s3 = new String("ABC가각");

    byte[] bytes = s3.getBytes();
    // 인스턴스에 들어 잇는 각 문자를 바이트 배열에 저장할 때
    // 인코딩 문자집합을 지정하지 않으면 JVM의 기본 문자집합으로 인코딩한다.
    // 이클립스에서 JVM을 실행하면 JVM은 기본으로 UTF-8 문자표를 사용하여
    // 바이트 배열에 코드 값을 저장한다.
    for (int i = 0; i < bytes.length; i++) {
      System.out.printf("%x, ", bytes[i]);
    }
    System.out.println();

    bytes = s3.getBytes("EUC-KR");
    for (int i = 0; i< bytes.length; i++) {
      System.out.printf("%x, ", bytes[i]);
    }
    System.out.println();

    String s4 = String.format("%s님 반갑습니다", "홍길동");
    System.out.println(s4);

    String s5 = String.join(",","홍길동","임꺽정","유관순");
    System.out.println(s5);

    String s6 = String.valueOf(true);
    String s7 = String.valueOf(3.14f);
    String s8 = String.valueOf(100);
    System.out.println(s6);
    System.out.println(s7);
    System.out.println(s8);

  }

}
