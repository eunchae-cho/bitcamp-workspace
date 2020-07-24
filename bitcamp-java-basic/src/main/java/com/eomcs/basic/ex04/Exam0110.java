// 변수 선언
// - 데이터를 저장할 메모리를 확보하는 명령
// Variablen sind einfache Container fuer digitalen Daten.
// Variablen speichern einfache Daten von Programmen in der Programmierung.


package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    // 데이터 타입 데이터명;
    int i;
    // 여러개의 변수를 만들때
    int i1;
    int i2;
    int i3;
    // 여러개의 변수를 한번에 만들대
    int x,y,z;
    
    
    // 값을 집어 넣을 때 
    // 변수명 = 값;
    i /*L-value*/ = 100/*R-value*/;    // **L-Wert(linke Operand),R-Wert(rechte Operand)
    // 여기서 '='은 할당 연산자(assignment operator/Zuweisungsoperator)라고 한다.
    // L-value = 메모리 변수, R-value = 메모리의 값
    x = i; //표현식
    y = i * x; //표현식
    
    byte b1;
    byte b2;
    b1 = 10; // [00001010]
    b2 = 12; // [00001100]
    b1 = b2; // b1 => [0001100]
    
    i = b1; // [00000000 00000000 00000000 00001100] 빈자리는 0으로 채워진다.
    // b2 = i; 컴파일 에러/문법오류 : 작은 메모리값에 큰 값을 넣으려 했기 때문
    b2 = (byte)i; // 강제타입변환  
    
    int a = 100; // 정수 4바이트를 넣을 메모리는 준비하고 그 메모리 이름은 a이며 값은 100을 넣는다.
    int b = 200;
    
    int aa, bb = 100, cc= 200, dd; //초기화(Initialisierung)
    
    byte xx = 10; // 00001010
    xx = 12; // 00001100    할당한다는 것은 값을 뒤집어 쓰는것
    xx = 78; // 01001110
  }  
}


// 데이터 타입 : 변수를 선언할 때 메모리의 종류
// <Primitive Datentypen>
// - 정수 : int(4byte), long(8byte);
// - 부동 소수점(실수) : float(4byte), double(8byte);
// - 문자 : char(2byte)
// - 논리 : boolean(4byte/1byte)  **Verwendet ganze Zahl, wird int genommen also 4byte
//                                **Verwendet Buchstabe, wird als Character genommoen dann 1byte


// 표현식(expression) : 결과를 생성(리턴)하는 문장 bsp> a+b=2, (a,b) etc
// 문장(statement)안에 표현식, 클래스, 변수 선언, 조건문, 반복문 등이 있다.



