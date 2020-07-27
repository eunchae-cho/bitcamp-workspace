package com.eomcs.basic.ex04;
// 명시적 형변환이 불가능한 경우

public class Exam0950 {
  public static void main(String[] args) {
    
    // 1) 정수 메모리끼리 형변환이 가능
    // 2) 부동소수점을 정수로 형변환 가능
    // 3) 형변환 없이 정수는 부동소수점 메모리에 저장 가능
    // 4) 숫자를 문자 코드로 형변환 가능
    // 그 외에는 변형 불가!
    
    // l = 123456789L;
    boolean bool;
    // bool = (boolean) l
    
    // 문자열 ==/==> 정수, 부동소수점, 문자, boolean
    // boolean v1 = (boolean) "true";
    // char v2 = (char) "가";
    // int v3 = (int) "123";
    // float v4 = (int) "3.14f";
    // 모두 컴파일 오류
  }

}
