package com.eomcs.basic.ex07;
// 배열의 생성은 어디서 하는 것이 좋은가?
// 상황에 따라 적합한 것을 선택하면 된다.
// 정답은 없다.

public class Exam0423 {

  public static void main(String[] args) {

    int[] money = new int[] {100, 200, 300};
    float[] total = new float[money.length];

    // 호출하는 쪽에서 결과를 담을 배열을 주는 경우
    compute(money, total, 0.0089f);

    for(int i = 0; i < money.length; i++) {
      System.out.printf("%d => %.1f\n",money[i],total[i]);
    }

    System.out.println("--------------------");


    //메소드쪽에서 결과를 담을 배열ㅇ르 만들어 리턴하는 경우
    float[] result;
    result = compute2(money, 0.0089f);

    for (int i = 0; i < money.length; i++) {
      System.out.printf("%d => %.1f\n",money[i],result[i]);
      }

   }



  static void compute(int[] money, float[] total, float interest) {
    for (int i = 0; i < money.length; i++) {
      total[i] = money[i] + (money[i] * interest);
     }
  }


  static float[] compute2(int[] money, float interest) {
    float[] total = new float[money.length];
    for(int i = 0; i < money.length; i++) {
      total[i] = money[i] + (money[i] * interest);
    }
    return total;
  }
}



