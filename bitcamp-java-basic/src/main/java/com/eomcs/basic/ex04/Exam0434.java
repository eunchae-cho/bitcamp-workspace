// 문자 변수 -  USC-2 코드 확인하기

package com.eomcs.basic.ex04;

public class Exam0434 {
  public static void main(String[] args) {
    
    int a = 0x41;
    
    for(int i = 0; i < 26; i++) {
      int b = a + i;
      System.out.printf("a의 문자 = %s, a의 유니코드 = %d\n",(char)(a+i),b);
    }
  }
}
