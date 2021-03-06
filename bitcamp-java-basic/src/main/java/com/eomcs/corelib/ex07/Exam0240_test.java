package com.eomcs.corelib.ex07;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Exam0240_test {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    ArrayBlockingQueue queue = new ArrayBlockingQueue(10);
    queue.offer(s1);
    queue.offer(s2);
    queue.offer(s3);
    queue.offer(s4);
    queue.offer(s5);

    Iterator iterator = queue.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next()+",");
      }
      System.out.println();
    }

}
