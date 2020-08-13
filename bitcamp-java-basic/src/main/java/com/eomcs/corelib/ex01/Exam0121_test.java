package com.eomcs.corelib.ex01;
// toString() 오버라이딩

public class Exam0121_test {

  static class My {
    String name;
    int age;

    @Override
    public String toString() {
      return "My3 [name = " + name + ", age = "+ age +"]";
    }

  }
  public static void main(String[] args) {
    My obj1 = new My();

    obj1.name = "홍길동";
    obj1.age = 20;

    System.out.println(obj1.toString());

    // println()의 파라미터 값으로 문자열을 넘겨주지 않으면
    // println() 내부에서 파라미터로 넘어온 객체에 대해 toString() 호출 후
    // 리턴값 출력
    System.out.println(obj1);
  }

}
