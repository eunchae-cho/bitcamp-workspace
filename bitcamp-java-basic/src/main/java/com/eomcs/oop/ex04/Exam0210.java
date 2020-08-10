package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    String s1 =  new String("Hello");
    String s2 = new String("ABC가각");


    // 인스턴스 메소드
    // - non-static 메소드
    // - 인스턴스 주소를 가지고 호출해야 함
    // - this라는 내장 변수가 있다.
    // - 특정 인스턴스의 변수를 다루는 메소드

    char c1 = s1.charAt(1); // 인덱스 값으로 출력
    System.out.println(c1);

    char c2 = s2.charAt(1); // value값은 바이트 배열이고 this을 갖고 있다.
    System.out.println(c2);

    // 값(s1의 문자열)이 앞에 있으면 음수 뒤에 있으면 양수가 나옴
    System.out.println(s1.compareTo("Hellp"));

    // 문자열안에 포함되어 있는 단어인지 확인
    System.out.println(s1.contains("ll"));
    System.out.println(s2.contains("ll"));

    System.out.println(s1.equals(s2));
    System.out.println(s1);

    System.out.println("--------------");

    //JVM(UTF-16) => OS기본문자표(linux/unix/macOS - UTF-8 , windows - MS949
    // "ABCr가각"
    // - linux/unix/macOS : 41 42 43 ea b0 ea b0 81
    // - windows : 41 42 43 b0 a1 b0 a2
    byte[] bytes = s2.getBytes(); //자바는 무조건 UTF-16으로 저장 (영어2byte,한글2byte)
    bytes = s2.getBytes("MS949");
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff)); // 출력할 때는 int로 인식해서 출력됨
                                                        // 그것을 없애기 위해 & 0xff
    }
      // 윈도우 사용자를 위해서 반드시 UTF-8을 지정해야 한다.

    // toHexString()은 static 메소드 - 괄호안의 값만 계산한다.
      // 주어진 괄호 안의 값만 있으면 사용 가능하다.
    System.out.println("--------------");
    String s3 = String.format("%s님 안녕!\n","홍길동");
    System.out.println(s3);

    String s4 = String.join(",","홍길동","임꺽정","유관순");
    System.out.println(s4);

    // 괄호 안의 값을 문자열로 만들어서 리턴한다.
    // 문자열로 만든 주소값을 만들어서 리턴하는 것이 정확한 표현
    // 인스턴스 메소드는 주소값을 다루는 것!
    String s5 = String.valueOf(true);
    String s6 = String.valueOf(100);
    String s7 = String.valueOf(3.14f);
    System.out.printf("%s %s %s\n",s5,s6,s7);

    System.out.println(Math.abs(-100));
    System.out.println(Math.ceil(3.28)); // 부동소수점 위 정수값
    System.out.println(Math.floor(3.28)); // 부동소수점 아래 정수값
    System.out.println(Math.round(3.14)); // 반올림
    System.out.println(Math.round(3.54));
    System.out.println(Math.pow(2,7)); // 2의 7제곱

    Date d1 = new Date();

    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1); // Sunday = 0 ...
    System.out.println(d1.getDate());
    System.out.println(d1.getDay());

    long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
    System.out.println(millis);

    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDay());

    long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDay());

    System.out.println("-------------");
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(1)); // year
    System.out.println(cal.get(2) + 1); // month
    System.out.println(cal.get(5)); // date
    System.out.println(cal.get(7)); // day(1-7)
    System.out.println(cal.get(4)); // 해당 월의 몇 번째 주
    System.out.println(cal.get(10)); // hour
    System.out.println(cal.get(11)); // 24 hours
    System.out.println(cal.get(12)); // minute
    System.out.println(cal.get(13)); // second

    System.out.println("-------------");
    System.out.println(cal.get(Calendar.YEAR)); // year
    System.out.println(cal.get(Calendar.MONTH) + 1); // month
    System.out.println(cal.get(Calendar.DATE)); // date
    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // day(1-7)
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); // 해당 월의 몇 번째 주
    System.out.println(cal.get(Calendar.HOUR)); // hour
    System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24 hours
    System.out.println(cal.get(Calendar.MINUTE)); // minute
    System.out.println(cal.get(Calendar.SECOND)); // second


    // int - Integer, short - Short, byte - Byte long - Long
    // float - Float, double - Double, char - Character
    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i1 == i2);   // 다른 객체 다른 주소값

    Integer i3 = Integer.valueOf(100);
    Integer i4 = Integer.valueOf(100);

    System.out.println(i3.toString());
    System.out.println(i4.toString());
    System.out.println(i3 == i4);   // 같은 객체 다른 주소값

    }

}
