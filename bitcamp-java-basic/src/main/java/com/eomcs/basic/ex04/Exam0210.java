// 블록 안에서 변수 선언 위치

package com.eomcs.basic.ex04;

public class Exam0210 {
  public static void main(String[] args) {
    
    // 사용할 변수를 블록{} 시작 부분에 미리 선언 가능
    int age;
    int weight;
    int height;
    
    age = 20;
    weight = 100;
    height = 200;
    
    // 블록{} 중간에도 변수 사용 가능
    int score;
    
    score = 100;
  }
}
