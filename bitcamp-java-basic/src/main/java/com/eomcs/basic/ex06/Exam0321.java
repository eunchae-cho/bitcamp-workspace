package com.eomcs.basic.ex06;
// break과 continue 활용

public class Exam0321 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    while (count < 100) {
      count++;
      if(count % 2 == 0) {
        sum += count;
      }
    }
    System.out.printf("count = %d, sum = %d\n",count,sum);

    System.out.println("-----------------------");

    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if(count % 2 == 1)
        continue;
      sum += count;
    }
    System.out.printf("count = %d, sum = %d\n",count,sum);
  }
}
