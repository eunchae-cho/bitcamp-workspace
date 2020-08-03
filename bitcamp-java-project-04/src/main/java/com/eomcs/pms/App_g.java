package com.eomcs.pms;

// 클래스 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
import java.sql.Date;


// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
// 2) 조건문을 사용하여 입출력 제어하기 
//      - 필요한 만큼만 입력받고 출력하고 싶다.
// 3) 배열을 사용하여 여러개의 값을 다루기
//      - 배열을 사용하면 간단하게 여러개의 변수를 사용할 수 있다.
// 4) 반복문을 사용하여 여러개의 변수를 선언할 수 있다.
//      - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 있다.
// 5)배열 개수를 변수에서 관리하기
//      - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있다.
// 6) 상수를 사용하여 초기 값을 변경하지 못하게 막기
//      - 변수는 중간에 값을 바꿀수 있기 때문에 값을 바꾸지 말아야
//      하는 경우 값을 바꾸지 말아야 한다.
// 7) 매서드를 사용하여 코드를 분리하기
//      - 메서드를 사용하면 기능별로 코드를 별도의 블럭으로 
//       분리할 수 있다. 작은 단위로 코드가 분리되면 관리하기 쉽다.
public class App_g {

  static int count = 0;     //static에서 접근해야하기 때문에 써야 함
  static final int MAX_LENGTH = 5;            // final문법 => 상수로 값을 고정
  static int[] number = new int[MAX_LENGTH];
  static String[] name = new String[MAX_LENGTH];
  static String[] email = new String[MAX_LENGTH];
  static String[] password = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static int[] tel = new int[MAX_LENGTH];
  static Date[] now = new Date[MAX_LENGTH];

  
  
  public static void main(String[] args) {

    
    System.out.println("[회원]");
    System.out.println();
    
    inputMembers();
    
    System.out.println("----------------------------");
    
    printMembers();
  
  }
  
  static void inputMembers() {
    Scanner keyInput = new Scanner(System.in);
    long currentMillis = 0;
    
    for(int i = 0; i < MAX_LENGTH; i++) {
      count++;
      
      // 1번
      System.out.print("번호? ");
      number[i] = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
      keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
      
      System.out.print("이름? ");
      name[i] = keyInput.nextLine();
      
      System.out.print("이메일? ");
      email[i] = keyInput.nextLine();
      
      System.out.print("암호? ");
      password[i] = keyInput.nextLine();
      
      System.out.print("사진? ");
      photo[i] = keyInput.nextLine();
      
      System.out.print("전화? ");
      tel[i] = keyInput.nextInt();
      keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
      now[i] = new Date(currentMillis);
      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(y/n) ");
      String response = keyInput.nextLine();
      System.out.println();
      
      if(response.equalsIgnoreCase("y") == false) {
        break;
      }
      
    }
    keyInput.close();
  }
  
  static void printMembers() {
    for (int i = 0; i < count; i++) {
      
    System.out.printf("%d, %s, %s, %s, %d, %s\n",
          number[i],name[i],email[i],password[i],tel[i],now[i].toString());
    }

  }
}

// 유지 보수 좋게 하기 위해 코딩을 한 번 더 보기 쉽게 
// 정리하는 것 => Refactoring 이라고 한다.
