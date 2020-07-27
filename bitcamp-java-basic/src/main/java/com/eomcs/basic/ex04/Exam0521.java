package com.eomcs.basic.ex04;
// 배열 - 배열이 필요할 때 : 같은 종류의 메모리를 많이 다룰 경우

public class Exam0521 {
  public static void main(String[] args) {
    int a1, a2, a3, a4, a5;
    a1 = 100;
    a2 = 90;
    a3 = 80;
    a4 = 70;
    a5 = 60;
    
    int sum = a1 + a2 + a3 + a4 + a5;
    System.out.println("sum: "+sum);
    
    int[] arr;
    arr = new int[5];
    arr[0] = 100;
    arr[1] = 90;
    arr[2] = 80;
    arr[3] = 70;
    arr[4] = 60;
    
    int sum2 = 0;
    for(int item : arr) {
      sum2 = sum2 + item;
    }
    System.out.println("sum2: "+sum2);
  }
}
