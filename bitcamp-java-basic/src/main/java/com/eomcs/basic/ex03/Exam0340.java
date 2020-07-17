// Exam0340.java
// 주제 : 메모리 크기에 따른 부동소수점의 크기


package com.eomcs.basic.ex03;


class Exam0340 {
    public static void main(String[] args) {
        // 345.6789234 의 수를 변수에 저장하는 코드를 작성하라.
        // float f = 345.6789234; 7자리수가 넘어서 안됨
        // double d = 345.6789.234f; 이렇게 적어도 안됨
        double d = 345.6789234;
        
        // 4바이트 메모리에 부동소수점 저장하기
        System.out.println(999.9999f); // 보통 소문자를 자주 씀
        System.out.println(999999.9f);
        System.out.println(9.999999f);

        // 메모리 크기가 넘는 값은 반올림 처리가 되어 저장된다.
        // 4바이트 메모리는 최대 7자리 부동소수점을 저장할 수 있다.
        // 초과하는 경우 반올림 처리되거나 잘린다.
        System.out.println(999.99994f); 
        System.out.println(9999999.4f);
        System.out.println(9.9999994f);

        System.out.println(987654321.1234567f); 
        System.out.println(9876543211234567.f);
        System.out.println(9.876543211234567f);

        // 8바이트 메모리에 부동소수점 저장하기
        System.out.println(987654321.1234567); 
        System.out.println(987654321123456.7);
        System.out.println(9.876543211234567);

        // 8바이트 메모리에는 최대 16자리의 부동소수점을 저장할 수 있다.
        // 초과하면 반올림처리되거나 잘린다.
        System.out.println(987654321.12345678); 
        System.out.println(9876543211234567.8);
        System.out.println(9.8765432112345678);

        // 유효자릿수
        // - 소수점을 제외한 숫자의 개수
        // 4바이트 메모리에는 최대 7자리까지 저장할 수 있다.
        // 8바이트 메모리에는 최대 16자리까지 저장할 수 있다.
        // 초과하는 수는 반올림되거나 잘린다.
        // 유효자릿수라 하더라도 100% 정확하지 않다.
        // IEEE 754 규격에 따라 이진수로 전환할 때 일부 값은 
        // 완전히 정확하게 변환되지 않는 경우도 있다.
        // 부동소수점 자리의 바이트값의 거의 두 배로 저장되기 때문에
        // double, float의 단어가 생겨났다.

        // 부동소수점의 일부는 정확하게 2진수로 변환할 수 없다.
        System.out.println(7 * 0.1); // 예상값 = 0.7

    }
}

