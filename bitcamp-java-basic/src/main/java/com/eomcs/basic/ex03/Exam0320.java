// Exam0320.java
// 주제 : 부동 소수점을 저장하는 크기


package com.eomcs.basic.ex03;


class Exam0320 // 클래스 선언 (class declaration)
{ // 클래스 정의 (class definition)
    public static void main(String[] args) // 메서드 선언 (method declaration)
    { // 메서드 정의 (method definition)
        
        // 부동 소수점 리터럴은 기본적으로 8바이트를 갖는다.
        System.out.println(3.14);
        System.out.println(3.14d); //d 또는 D 를 붙여도 된다.
        System.out.println(3.14D);

        // 4바이트 메모리를 갖는다.
        System.out.println(3.14f); //f 또는 F 를 붙여도 된다.
        System.out.println(3.14F);

    }
}

