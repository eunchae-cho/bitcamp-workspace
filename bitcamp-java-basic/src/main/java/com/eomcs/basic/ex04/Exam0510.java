package com.eomcs.basic.ex04;
// Array- Reference

public class Exam0510 {
  public static void main(String[] args) {
    int[] p = new int[3]; //c언어 : malloc(sizeof(int)*3)  
    // p 
    // - int 배열의 주소를 담는 변수이다.
    // - 자바에서는 보통 '레퍼런스'라고 부른다.
    
    // new int[3]
    // - int 변수를 연속해서 3개 확보한다.
    // - 메모리는 확보한 후 리턴 값은 그 메모리의 시작 주소이다.
    //
    
    // 배열 레퍼런스를 선언하는 방법
    int[] p2; // 자바에서 주로 사용하는 방식
    int p3[]; // C언어 방식도 사용 가능
              // 단, 갯수를 지정하면 안된다.

    
    
    //배열의 개수 알아내기
    System.out.println("배열의 개수: "+p.length);
    
    //배열의 주소가 없는 상태에서 사용하지 말자
//    int[] x;
//    x = null;
//    System.out.println(x.length);
    // C와 다른점 : C와 달리 자바는 값을 넣고 사용할 수 없다. 
    
    // 배열에 값 저장
    //(p+1) = 100;  C언어
    p[0] = 100;
    p[1] = 200;
    p[2] = 300;
    // *p = 400;    C언어
    System.out.printf("%d, %d, %d\n", p[0],p[1],p[2]);
    
    // p[3] = 400;   Array index out of bounds .. 컴파일 에러
    // p[-1] =500;   Runtime Exception .. 컴파일 에러
    
    int sum = 0;
    for ( int i = 0; i < p.length; i++) {
      sum = sum + p[i];
      System.out.println(sum);
    }
    
    p2 = p; // p 레퍼런스에 저장된 주소를 p2에 저장한다.
    // p주소를 임의적으로 변경할 수 없다.
    // p2 = 100;  컴파일 에러 - 주소값 포인터에 값을 넣을 수 없음s
    
    p2[1] = 1000;
    System.out.println(p[1]);
    
    p = new int[4]; // int 4개의 새로운 배열 생성
    p[1] = 2000;
    System.out.printf("%d, %d\n",p[1],p2[1]);
    
    //System.out.println(p3[1]); 컴파일 오류 - 메모리 선언한적 없음
    //System.out.println(&p) 자바는 주소를 출력할 수가 없음
    // 자바에서는 주소값을 알려주지 않는다.
    
    //new 명령으로 확보한 메모리 => Instance
    //인스턴스의 새로운 주소를 저장하는 변수 => Reference
    //Primitive type를 제외한 나머지 전부는 Reference!
    
    //레퍼런스 변수에 주소값을 0으로 초기화 하기
    // p2 = 0; 컴파일 오류 - 직접적으로 초기화 불가능
    p2 = null; // 주소 변수(레퍼런스)를 초기화 시키려면 null 사용
    // System.out.println(p2[0]); 컴파일 에러 - 초기화됨
    
    int k1;
    //System.out.println(k1); 컴파일 오류 - 변수 선언 없음
    
    int[] k2 = new int[3];
    // new 메모리로 준비를 할 때, 
    // - 모든 메모리는 0으로 자동 초기화 된다.
    // - 따로 초기화할 필요 없이 바로 사용 가능
    System.out.println(k2[0]);
    System.out.println(k2[1]);
    System.out.println(k2[2]);
    
    
    // 배열 생성 후 즉시 초기화하기
    int[] k3 = new int[] {100,200,300};
    // => {}안에 넣을 수 있는 int 배열 3개 만든 후 그 안에 값을 넣는다.
    // => 배열의 개수를 지정해서는 안된다.
    int[] k4;
    k4 = new int[] {10,20};
    
    int[] k5 = {11,12,13}; // new int[] 생략가능
    
    int[] k6;
//    k6 = {111,222,333} 변수 선언과 떨어져있을 때는 생략 불가!
    
    int[] x1 = new int[3];
    int[] x2 = new int[4];
    int[] x3 = x1;
    x2 = x1;
    // x1, x2, x3가 모두 같은 메모리를 가리킴
    // x2가 가리키고 있었던 int 배열 메모리는 주소값을 잃어버리게 된다. 
    // 이렇게 사용할 수 없게 된 메모리를 Garbage 쓰레기라고 한다.
    // 가비지는 JVM이 자동으로 해제시킨다. => Garbage Collector
    // 바로 해제시키는 것이 아니라 다음의 조건을 충족시켜야 한다.
    //  1) 메모리가 부족할 대
    //  2) 시스템이 한참동안 한가할 때
    //  => 언제 가비지에서 메모리에서 해제시킬지 알 수 없다.
    // 무효한 메모리는 dangling pointer라고 하고 그 값을 garbage값라고 한다.
    // 자바에서는 dangling pointer가 없다.
    System.gc(); // 가능하다면 빠른 시일 내에 가비지를 수집해줄 것을 요구
    // gc메소드를 호출한다고 해서 바로 가비지 콜렉터가 동작하는 것은 아니다.
    // 가비지 컬렉터의 실행을 앞당겨 달라고 요청하는 것이다.
    // 그 요구를 수용할지 여부는 JVM판단에 달려있다.
    // 따라서 gc메소드를 호출하면 가비지 콜렉터가 바로 실행된다고 믿지 말자
    
    
    
  }
}
