package com.eomcs.basic.ex06;
// 반복문 while (조건) 문장

public class Exam0310 {
  public static void main(String[] args) {
    int count = 0;
    while (count++ < 20) {
      //if (count % 2 != 0) // ((count & 1) != 0) 홀수 비트연산자 활용
        if (count > 5)
        break;   //즉시 조건문으로 실행 이동
      System.out.println(count);
    }
    System.out.println("---------");
    int a = 0;
    int sum = 0;
    while (a < 100) {
      a++;
      sum = sum + a;
    }
    System.out.println(sum);

    System.out.println("---------");
    int a2 = 0;
    int sum2 = 0;
    while (a2 < 100) {
      sum2 = sum2 + ++a2;
    }
    System.out.println(sum2);

    System.out.println("---------");
    int a3 = 0;
    int sum3 = 0;
    while (a3++ < 100) {
      sum3 = sum3 + a3;
    }
    System.out.println(sum3);

//    바이트 코드로 변환될 때 이렇게 바뀐다.
//    while
//    int temp = count;
//    count = count + 1;
//    boolean condition = temp <10;
//    if (condition == true) {
//      System.out.println("안녕");
//    }

System.out.println("---------------");

//구구단
    int i = 2;
    int j = 1;

    loop: {
      while (i <= 9) {    // 중첩 = nested
        j = 1;
        while(j <= 9) {
          System.out.printf("%d x %d = %d\n",i,j,i*j);
          if (i == 5 && j == 5)
            break loop;
          j++;
        }
        i++;
        System.out.println("===========");
      }
    }
    System.out.println("--------------");
    System.out.println("종료!");

    System.out.println("---------------------");


    int i2 = 0;

    do {
      System.out.println(i2);
      i2++;
    } while (i2 < 10);

  }
}
