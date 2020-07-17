// Exam0100.java
// 주제 : literal 


package com.eomcs.basic.ex03;


class Exam0100 { 
    public static void main(String[] args){
        // 출력 명령문
        // System.out.println(값);

        // [숫자]
        // 정수
        System.out.println(78);
        System.out.println(+78);
        System.out.println(-78);
        System.out.println(0116); // 0으로 시작하면 8진수
        System.out.println(0x4e); // 0x로 시작하면 16진수
        System.out.println(0b01001110); // 0b로 시작하면 2진수

        // 부동 소수점(실수)
        System.out.println(3.14); //고정 소수점
        System.out.println(31.4e-1); //10의 -1승
        System.out.println(314e-2); //10의 -2승
        System.out.println(0.0314e2); 

        // [논리]
        // 참/거짓
        System.out.println(true);
        System.out.println(false);
        
        // [문자]
        // 문자
        System.out.println('A'); 
        System.out.println('가');

        // 문자열
        System.out.println("A"); 
        System.out.println("가");
        System.out.println("");
        System.out.println("ABC"); 
        System.out.println("가나다");
    }
}

