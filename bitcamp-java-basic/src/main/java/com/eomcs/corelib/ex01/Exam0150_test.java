package com.eomcs.corelib.ex01;

import java.util.HashSet;

public class Exam0150_test {

  static class Student {
    String name;
    int age;
    boolean working;

  public Student(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 20, false);
    Student s2 = new Student("홍길동", 20, false);
    Student s3 = new Student("임꺽정", 21, true);
    Student s4 = new Student("유관순", 22, true);

    System.out.println(s1 == s2);

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s4.hashCode());
    System.out.println();

    // collection 목록관리
    // 헤시셋 객체를 보관한다.
    HashSet<Student> set = new HashSet<Student>();
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);

    Object[] list = set.toArray();
    for (Object obj : list) {
      Student student = (Student) obj;
      System.out.printf("%s, %d, %s\n",
          student.name, student.age, student.working ? "재직중" : "실업중");
    }


  }
}
