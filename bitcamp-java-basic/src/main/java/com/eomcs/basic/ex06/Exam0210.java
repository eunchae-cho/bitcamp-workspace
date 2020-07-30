package com.eomcs.basic.ex06;
// switch문
// 참고 : 주석이 달린 유지 보수 코드는 좋지 않다.
public class Exam0210 {
  public static void main(String[] args) {
    // 상수를 쓰는 이유 : 명확히 나타내기 위해서 (for clean code)
    final int DEVELOPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;

    int type = DEVELOPER;

    if (type == DEVELOPER) { // 개발자
      System.out.println("정보처리자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENERAL_MANAGER) { // 일반관리
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILDING_MANAGER) { // 시설관리
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }

    System.out.println("------------------------");

    switch (type) {
      case DEVELOPER:       // 변수가 올 수 없음
        System.out.println("정보처리자격증");
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");
    }

    System.out.println("\n****break을 이용하여 정보를 출력하기****\n");

    switch (type) {
      case DEVELOPER:       // 변수가 올 수 없음
        System.out.println("정보처리자격증");
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");
    }

    System.out.println("------------------------");

    int score = 70;

    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
        System.out.println("C");
        break;
      default:
          System.out.println("F");
    }

    System.out.println("------------------------");

    String value = "developer";
    String value2 = "hello";
    final String value3 = "hi";

    // byte,char, short, int 가능 => 4바이트 이하 정수 가능
    // String => 문자열 가능

    switch (value) {
      case "developer":
        break;
      case "manager":
        break;
      //case value2:        변수는 불가능
      case value3:      //  상수와 리터럴 가능
      case "ok" + "haha": // 상수 표현식 가능
      default:
    }

    int value4 = 100;
    final int x = 200;

    switch (value4) {
      case 100:
        break;
      case 100 + 3:
        break;
      case x:
        break;
      case x + 3:
        break;
    }

    System.out.println("------------------------");

    // 열거 타입 쓰는 이유
    // 변수를 선언하는 과정에서 실수을 줄이기 위해서
    Job type2 = Job.DEV;

    switch (type2) {
      case DEV:
        break;
      case GM:
        break;
      case BM:
        break;
    }


  }
  // 열거 타입- main()밖에서 선언
  enum Job {
    DEV,GM,BM
  }

}
