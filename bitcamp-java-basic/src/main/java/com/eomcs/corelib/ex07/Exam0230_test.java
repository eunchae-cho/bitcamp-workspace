package com.eomcs.corelib.ex07;

import java.util.Iterator;
import java.util.Stack;

public class Exam0230_test {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("ccc");

    Stack stack = new Stack();
    stack.push(s1);
    stack.push(s2);
    stack.push(s3);
    stack.push(s4);
    stack.push(s5);

    Iterator iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next()+",");
    }
    System.out.println();
  }

}
