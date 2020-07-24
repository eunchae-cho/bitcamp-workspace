package com.eomcs.pms;


public class App {

  public static void main(String[] args) {

    // 콘솔에서 사용자의 입력을 처리하는 도구를 준비한다.
    // => 키보드 : System.in
    // => input stream에서 data를 읽어 적절한 타입으로
    // 리턴하는 도구 : Scanner
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    // new java.io.BufferedInputStream(System.in);
    // new java.io.DataInputStream(System.in);
    
    System.out.println("[회원]");
    System.out.println();
    System.out.print("번호? ");
    int number = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
    keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
    
    System.out.print("이름? ");
    String name = keyInput.nextLine();
    
    System.out.print("이메일? ");
    String email = keyInput.nextLine();
    
    System.out.print("암호? ");
    String password = keyInput.nextLine();
    
    System.out.print("사진? ");
    String photo = keyInput.nextLine();
    
    System.out.print("전화? ");
    int tel = keyInput.nextInt();
    keyInput.nextLine();
    
    long currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
    java.sql.Date now = new java.sql.Date(currentMillis);
 

    keyInput.close();
    
    System.out.println("--------------------------");
    System.out.println("번호: "+number);
    System.out.printf("이름: %s\n",name);
    System.out.println("이메일: "+email);
    System.out.printf("암호: %s\n",password);
    System.out.println("전화: "+tel);
    System.out.printf("가입일: %s\n",now.toString());
  }
}

// 유지 보수 좋게 하기 위해 코딩을 한 번 더 보기 쉽게 
// 정리하는 것 => Refactoring 이라고 한다.
