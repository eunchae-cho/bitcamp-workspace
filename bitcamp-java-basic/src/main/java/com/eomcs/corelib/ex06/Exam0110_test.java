package com.eomcs.corelib.ex06;
// Queue의 구현과 사용

import java.util.concurrent.ArrayBlockingQueue;

public class Exam0110_test {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    ArrayBlockingQueue queue = new ArrayBlockingQueue(10);
    queue.offer(s1);
    print(queue);
    queue.offer(s2);
    print(queue);
    queue.offer(s3);
    print(queue);

    System.out.println("=> "+queue.poll());
    print(queue);
    System.out.println("=> "+queue.poll());
    print(queue);

    System.out.println("---------------------");

    String value;
    while((value = (String)queue.poll()) != null) {
      System.out.println(value);
    }

  }

  static void print(ArrayBlockingQueue queue) {
    Object[] arr = queue.toArray();
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]+",");
    }
    System.out.println();
  }
}
