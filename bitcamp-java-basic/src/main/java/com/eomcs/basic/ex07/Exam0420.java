package com.eomcs.basic.ex07;
// Heap 메모리 영역 II

public class Exam0420 {

  static int[] getArray(int[] arr) {
    arr[0] = 100;
    arr[1] = 200;
    arr[3] = 300;
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[3];
    getArray(arr);
    System.out.println(arr[1]);
  }
}
