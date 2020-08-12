package com.eomcs.oop.ex07.b;

public class Exam0140 {
  public static void main(String[] args) {
    Customer4 c = new Customer4();

    c.setName("홍길동");
    c.setAge(300);
    c.setWeight(100);
    c.setHeight(-50);

    System.out.printf("%s, %d, %d, %d\n",
        c.getName(), c.getAge(),
        c.getWeight(), c.getHeight());
  }
}
