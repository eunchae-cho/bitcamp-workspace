package com.eomcs.basic.ex05;
// 산술 연산자 - 암시적 형변환

public class Exam0150_test {
  public static void main(String[] args) {
    
    byte b = 1;
    short s = 2;
    int i = 3;
    long l = 4;
    float f = 5.5f;
    double d = 6.6;
    boolean bool = true;
    char c = 7;
    
    
    // byte + byte = int
    // byte r1 = b + b; 컴파일 오류
    
    // short + short = int
    // short r2 = s + s; 컴파일 오류
    
    // byte + int = int
    // short r3 = b + s; 컴파일 오류
    
    // byte + short = int
    // => byte와 short 값은 int로 암시적 형변환 된다.
    
    // byte + int = int
    int r4 = b + i;
     
    // short + int = int
    int r5 = s + i;
     
    // int + long = long
    long r6 = l + i;
    
    // int + float = float
    float r7 = f + i;
    
    // long + float = float
    float r8 = f + l;
    
    // float + double = double
    double r9 = d + f;
    
    // byte + short + int + long + float + double = double
    double r10 = d + f+ l + i + s;
    
    // float + short + int + long + float +  double = double
    
    // boolean + int => 컴파일 오류!
    
  }
}
