package com.eomcs.basic.ex04;
// 배열 - 배열 레퍼런스와 null

public class Exam0551 {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[5];
    
    arr[0] = 100;
    
    arr = null;
    
    System.out.println(arr[0]);
  }
}
