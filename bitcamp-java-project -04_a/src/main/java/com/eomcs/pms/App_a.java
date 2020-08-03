package com.eomcs.pms;

// 클래스 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
import java.sql.Date;


// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
public class App_a {

  public static void main(String[] args) {

 
    Scanner keyInput = new Scanner(System.in);
   
    
    System.out.println("[회원]");

    int number1, number2, number3, number4, number5;
    String name1, name2, name3, name4, name5;
    String email1, email2, email3, email4, email5;
    String password1, password2, password3, password4, password5;
    String photo1, photo2, photo3, photo4, photo5;
    int tel1, tel2, tel3, tel4, tel5;
    Date now1, now2, now3, now4, now5;
    long currentMillis;
    
    System.out.println();
    // 1번
    System.out.print("번호? ");
    number1 = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
    keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
    
    System.out.print("이름? ");
    name1 = keyInput.nextLine();
    
    System.out.print("이메일? ");
    email1 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password1 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo1 = keyInput.nextLine();
    
    System.out.print("전화? ");
    tel1 = keyInput.nextInt();
    keyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
    now1 = new Date(currentMillis);
    System.out.println();
   
   
    // 2번
    System.out.print("번호? ");
    number2 = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
    keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
    
    System.out.print("이름? ");
    name2 = keyInput.nextLine();
    
    System.out.print("이메일? ");
    email2 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password2 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo2 = keyInput.nextLine();
    
    System.out.print("전화? ");
    tel2 = keyInput.nextInt();
    
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
    now2 = new Date(currentMillis);
    System.out.println();
    
    
    //3번
    System.out.print("번호? ");
    number3 = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
    keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
    
    System.out.print("이름? ");
    name3 = keyInput.nextLine();
    
    System.out.print("이메일? ");
    email3 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password3 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo3 = keyInput.nextLine();
    
    System.out.print("전화? ");
    tel3 = keyInput.nextInt();
    keyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
    now3 = new Date(currentMillis);
    System.out.println();
   
    
    //4번
    System.out.print("번호? ");
    number4 = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
    keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
    
    System.out.print("이름? ");
    name4 = keyInput.nextLine();
    
    System.out.print("이메일? ");
    email4 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password4 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo4 = keyInput.nextLine();
    
    System.out.print("전화? ");
    tel4 = keyInput.nextInt();
    keyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
    now4 = new Date(currentMillis);
    System.out.println();
    
    
    //5번
    System.out.print("번호? ");
    number5 = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
    keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
    
    System.out.print("이름? ");
    name5 = keyInput.nextLine();
    
    System.out.print("이메일? ");
    email5 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password5 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo5 = keyInput.nextLine();
    
    System.out.print("전화? ");
    tel5 = keyInput.nextInt();
    keyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
    now5 = new Date(currentMillis);
    System.out.println();

    
    keyInput.close();
    
    System.out.println("----------------------------");
    System.out.printf("%d, %s, %s, %s, %d, %s\n",number1,name1,email1,password1,tel1,now1.toString());
    System.out.printf("%d, %s, %s, %s, %d, %s\n",number2,name2,email2,password2,tel2,now2.toString());
    System.out.printf("%d, %s, %s, %s, %d, %s\n",number3,name3,email3,password3,tel3,now3.toString());
    System.out.printf("%d, %s, %s, %s, %d, %s\n",number4,name4,email4,password4,tel4,now4.toString());
    System.out.printf("%d, %s, %s, %s, %d, %s\n",number5,name5,email5,password5,tel5,now5.toString());
    
  }
}

// 유지 보수 좋게 하기 위해 코딩을 한 번 더 보기 쉽게 
// 정리하는 것 => Refactoring 이라고 한다.
