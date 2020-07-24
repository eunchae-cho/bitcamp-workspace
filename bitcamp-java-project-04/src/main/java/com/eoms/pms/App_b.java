package com.eoms.pms;

// 클래스 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
import java.sql.Date;


// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
// 2) 조건문을 사용하여 입출력 제어하기 
//      필요한 만큼만 입력받고 출력하고 싶다.
// 
public class App_b {

  public static void main(String[] args) {

 
    Scanner keyInput = new Scanner(System.in);
   

    System.out.println("[회원]");
    System.out.println();
    
    
    int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
    String name1 = "", name2 = "", name3 = "", name4 = "", name5 = "";
    String email1 = "", email2 = "", email3 = "", email4 = "", email5 = "";
    String password1 = "", password2 = "", password3 = "",password4 = "", password5 = "";
    String photo1 = "", photo2 = "", photo3 = "", photo4 = "", photo5 = "";
    int tel1 = 0, tel2 = 0, tel3 = 0, tel4 = 0, tel5 = 0;
    Date now1 = null, now2 = null, now3 = null, now4 = null, now5 = null;
    long currentMillis = 0;
    int count = 1;
    
    
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
    
    System.out.print("계속 입력하시겠습니까?(y/n) ");
    String response = keyInput.nextLine();    
    
    
    if (response.equals("y") || response.equals("Y")) {
      count = count + 1;
      
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
      
      System.out.print("계속 입력하시겠습니까?(y/n) ");
      response = keyInput.nextLine();
      
      
      
      if(response.equalsIgnoreCase("y")) {
        count += 1;
        
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
        
        System.out.print("계속 입력하시겠습니까?(y/n) ");
        response = keyInput.nextLine();
        System.out.println();
        
        
        if (response.equalsIgnoreCase("y")) {
          count++;
          
          // 4번    
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
          
          System.out.print("계속 입력하시겠습니까?(y/n) ");
          response = keyInput.nextLine();
          
          
          if(response.equalsIgnoreCase("y")){
            count++;
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
          }
          
          
        }
        
        
      }
      
      
    }
    
    
    keyInput.close();
    
    System.out.println("----------------------------");
    
    System.out.printf("%d, %s, %s, %s, %d, %s\n",number1,name1,email1,password1,tel1,now1.toString());
    if (count > 1) {
      System.out.printf("%d, %s, %s, %s, %d, %s\n",number2,name2,email2,password2,tel2,now2.toString());
      if (count > 2) {
        System.out.printf("%d, %s, %s, %s, %d, %s\n",number3,name3,email3,password3,tel3,now3.toString());
        if (count > 3) {  
          System.out.printf("%d, %s, %s, %s, %d, %s\n",number4,name4,email4,password4,tel4,now4.toString());
          if (count > 4) { 
            System.out.printf("%d, %s, %s, %s, %d, %s\n",number5,name5,email5,password5,tel5,now5.toString());
          }
        }
      }
    }
    
  }
}

// 유지 보수 좋게 하기 위해 코딩을 한 번 더 보기 쉽게 
// 정리하는 것 => Refactoring 이라고 한다.
