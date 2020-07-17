// Exam0240.java
// 주제 : 정수값을 메모리에 저장하는 방법


package com.eomcs.basic.ex03;


class Exam0240 { 
    int a = 0xaaaaaaaa;
    int b = -0xaaaaaaaa;
    public static void main(String[] args){
        System.out.println(5 - 3); // 연산자와 피연산자 사이 공백을 줌, 하지만 괄호옆에 공백X
        System.out.println(5 + (-3)); // 3의 보수
        
        // K = 2**(비트수 - 1) - 1 
        //   = 2**(8 - 1) - 1
        //   = 2**7 - 1
        //   = 128 - 1
        //   = 127

        // 0000 0011 <= +3 2진수 
        // 1111 1101 <= -3 2진수(2의 보수) 
        // 1000 0011 <= -3 Sign-Magnitude
        // 0111 1100 <= -3 Excess-K(bias) = -3 + 127 = 124

        // 0111 1011 <= +123 2진수 
        // 0000 0101 <= -123 2진수(2의 보수) 
        // 1111 1011 <= -123 Sign-Magnitude
        // 0000 0100 <= -123 Excess-K(bias) = -123 + 127 = 4

        // 10101010 10101010 10101010 <= +aaaaaaaa 2진수 
        // 01010101 01010101 01010110 <= -aaaaaaaa 2진수(2의 보수) 
        // 55 55 55 56<= -aaaaaaaa 16진수

        
    }
}

