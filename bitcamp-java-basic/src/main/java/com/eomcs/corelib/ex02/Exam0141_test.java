package com.eomcs.corelib.ex02;

public class Exam0141_test {
  public static void main(String[] args) {
    Object obj = new String("Hello");
    String x1 = (String) obj;
    String x2 = obj.toString();
    System.out.println(x1 == x2);


    // obj에 대해 toString()을 호출할 때
    // obj의 클래스의 선언된 멤버(필드,메서드)만 사용 가능
    // 단 멤버는 실제 obj가 가리키는 클래스부터 올라간다.
    // obj가 가리키는 것은 String객체이기 때문에
    // 이런 경우 toString()을 호출할 때 String 클래스에서부터 찾는다.
    // String 클래스가 toString()을 오버라이딩 했기 때문에
    // 결국 오버라이딩 메서드를 호출할 것

  }

}
