// Exam0300.java
// 주제 : 애노테이션 (Annotation)

package com.eomcs.basic.ex02;



public class  Exam0300 { 
    

    public static void main (String[] args){

    }

    @Override // 컴파일러 또는 JVM에게 지시하는 명령
             // 기존 기능을 재정의하는 것이 맞는지 검사
    public String toStrong() {
        return "test";
    }
    
}   

