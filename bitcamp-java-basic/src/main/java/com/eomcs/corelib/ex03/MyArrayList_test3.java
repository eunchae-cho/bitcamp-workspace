package com.eomcs.corelib.ex03;

public class MyArrayList_test3 {
  public static void main(String[] args) {

    // 1번 리스트
    MyArrayList list1 = new MyArrayList();
    list1.add("aaa");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    list1.add("eee");

    // 2번 리스트
    MyArrayList list2 = new MyArrayList();
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");


    print(list1);

    System.out.println("------------------");

    print(list2);

  }

  static void print(MyArrayList list) {

    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str+",");
    }
    System.out.println();

  }
}
