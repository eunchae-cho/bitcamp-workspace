package com.eomcs.basic.ex04;
// 배열 - 배열 레퍼런스와 배열 인스턴스

public class Exam0530 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    
    arr = new int[5];
    arr[0] = 100;
    arr[1] = 200;
    
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    
  }
}
