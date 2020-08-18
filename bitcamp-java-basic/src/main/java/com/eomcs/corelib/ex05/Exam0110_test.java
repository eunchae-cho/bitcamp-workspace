package com.eomcs.corelib.ex05;
// Stack 구현과 사용

import  java.util.Stack;

public class Exam0110_test {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    Stack stack = new Stack();
    stack.push(s1);
    print(stack);
    stack.push(s2);
    print(stack);
    stack.push(s3);
    print(stack);

    System.out.println("=> "+ stack.pop());
    print(stack);
    System.out.println("=> "+ stack.pop());
    print(stack);

    stack.push(s4);
    print(stack);
    stack.push(s5);
    print(stack);

    System.out.println("---------------------");

    String value;

    try {
      while (true) {
        System.out.print(stack.pop()+",");
        }
    } catch (Exception e) {
        System.out.println("\n스택에서 더이상 꺼낼 데이터가 없습니다.");
      }


  }

  static void print(Stack stack) {
    for (int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i)+ ",");
    }
    System.out.println();
  }
}
