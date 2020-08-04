package com.eomcs.basic.ex07;

public class Exam0210 {
  public static void main(String[] args) {

    m1();

    m2("홍길동"); // 문자열 리턴, m2(100); 불가

    String message = m3();
    System.out.println(message);

    m3();   //호출만하고 리턴 안 하기 가능

    // int result = m3();
    // message = m3(100);

    message = m4("홍길동");
    System.out.println(message);

    message = m5("홍길동", 20, false);
    System.out.println(message);


    m6("홍길동", 100, 90, 80);
    m7("홍길동", new int[] {100, 90, 80, 70, 60}); // 배열 주소가 와야함 배열을 주고 받을 수 없음
    // 레퍼런스는 주소이므로 직접적으로 못오고 주소가 오게 된다.
    m7("홍길동", new int[] {100, 90});
    m7("홍길동", new int[] {});
    //m7("홍길동", new int[] {});  컴파일 에러 - 0으로 계산 불가능하기 때문
    //배열을 쓰다보니 일일히 쓰는게 귀찮음
    //그래서 가변 파라미터가 생겨남 => m8
    //우리는 편하게 밑에 m8처럼 쓰지만 컴파일 할 때는 결론적으로 m7로 바뀐다.

    System.out.println("-------------------------------");

    m8("홍길동",100, 90, 80, 70, 60);
    m8("홍길동",100, 90, 80);
    m8("홍길동",100);
    m8("홍길동");

    System.out.println("--------------------------------");

    m10(new int[] {100, 90, 80}, new String[] {"국어","영어","수학"}, "홍길동");


    // 2 + 3 + 7 + 4 =?
    int sum = 0;
//    sum = plus(2,3);
//    sum = plus(sum,7);
//    sum = plus(sum,4);
//    System.out.prinln(sum);
    // 위와 같은 것
    System.out.println(plus(sum = plus(plus(2,3),7),4));

  }



  static void m1() {
    System.out.println("Hello!");
  }

  static void m2(String name) {
    System.out.println(name + "님 반갑습니다!");
  }

  static String m3() {      // String 값만 리턴 가능
    return "안녕하세요";
  }
  // static int m3() {          가능 - 유니코드값이 있기 때문
  // return 'A';

  static String m4(String name) {
    return name + "님 반갑습니다.^^"; //값을 받아서 작업할 때
  }

  static String m5(String name, int age, boolean working) {
    return age + "살 "+ name +"님은 현재 재직상태가 "+ working +"입니다.";
  } // parameter는 여러 개 한꺼번에 사용가능하지만
    // return은 하나의 값만 가질 수 있다.

  static void m6(String name, int a, int b, int c) {
    int sum = a + b +c;
    int aver = sum / 3;
    System.out.printf("%s: %d(%d)\n",name,sum,aver);
  }

  static void m7(String name, int[] scores) {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if (scores.length > 0) {    // 배열이 0이 되지 않도록 보수함
      aver = sum /scores.length;
    }

    System.out.printf("%s: %d(%d)\n",name,sum,aver);
  }

  static void m8(String name, int... scores) {  //가변 파라미터 - 배열로 다룬다, 호출하는데 편하다
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if (scores.length > 0) {    // 배열이 0이 되지 않도록 보수함
      aver = sum /scores.length;
    }

    System.out.printf("%s: %d(%d)\n",name,sum,aver);
  }


// 가변 파라미터에 대해 주의할 점

//  1) 가변 파라미터는 무조건 맨 끝에 와야 한다.
//  static void m9(int... scores, String name) {
//  }

  //2) 가변 파라미터는 여러개 선언할 수 없다.
//  static void m9(int... scores, int... scores2) {
// 예) 메소드 m9(100,90,80,70); 이렇게 있을텐데 어디부터 어디까지 어떤 배열에 속해있는지 모름
//  }

  // 3) 이 경우에도 애매해져서 안 됨
  //    다른 타입의 변수가 오더라도 가변 파라미터를 한 개 초과하여 둘 수 없다.
 // static void m9(int... titles, String name, int... scores) {
//    m9("국어","수학","홍길동",100,90);
  //  }


  // 반면에 배열은 상관 없다.
  static void m10(int[] scores, String[] subjects, String name){
    if (scores.length != subjects.length) {
      System.out.println("과목 수와 점수의 개수가 다릅니다.");
      return;   // 즉시 메소드 호출을 끝냄
    }
    System.out.println(name + "님 점수!");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s = %d 점\n",subjects[i],scores[i]);
    }
  }

  static int plus(int a, int b) {
    return a + b;
  }

}
