package com.eomcs.basic.ex04;
// 배열 - 배열 레퍼런스와 배열 인스턴스 III

public class Exam0550 {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[5];
    
    int[] arr2 = arr;
    arr2[0] = 100;
    
    System.out.println(arr[0]);
  }
}
