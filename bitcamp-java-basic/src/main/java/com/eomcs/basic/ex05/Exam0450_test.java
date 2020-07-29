package com.eomcs.basic.ex05;
// 비트 이동 연산자 응용 II

public class Exam0450_test {
  public static void main(String[] args) {
    
    //방법 1
    boolean c, cpp, java, js, python, php, html, css;
    c = true;
    cpp = false;
    java = true;
    js = false;
    python = true;
    php = false;
    html = true;
    css = false;
    
    //방법 2 - 배열 활용
    boolean[] arr = new boolean[8];
    arr[0] = true;
    arr[1] = false;
    arr[2] = true;
    arr[3] = false;
    arr[4] = true;
    arr[5] = false;
    arr[6] = true;
    arr[7] = false;
    
    //방법 3 - 비트 이동 연산자 활용
    int lang = 0;
    lang |= 0x80;
    lang |= 0x20;
    lang |= 0x08;
    lang |= 0x02;
    
  }
}
