package com.eomcs.basic.ex06;
// 흐름 제어문 - 중첩된 반복문 탈출

public class Exam0331 {
  public static void main(String[] args) {
    int x = 2, y = 1;

    myloop:
      while (x <= 9) {
        while(y <= 9) {
          System.out.printf("%d * %d = %d\n",x,y,x*y);
          if (x == 5 && y == 5)
            break myloop;
          y++;
          }

        System.out.println();
        x++;
        y = 1;
        }
      System.out.println("종료");

  }

}
