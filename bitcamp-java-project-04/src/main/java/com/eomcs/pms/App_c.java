package com.eomcs.pms;

// 클래스 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
import java.sql.Date;


// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
// 2) 조건문을 사용하여 입출력 제어하기 
//      - 필요한 만큼만 입력받고 출력하고 싶다.
// 3) 배열을 사용하여 여러개의 값을 다루기
//      - 배열을 사용하면 간단하게 여러개의 변수를 사용할 수 있다.

public class App_c {

  public static void main(String[] args) {

 
    Scanner keyInput = new Scanner(System.in);
   
    
    int[] number = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] photo = new String[5];
    int[] tel = new int[5];
    Date[] now = new Date[5];
    
    long currentMillis;
    int count = 1;
    
    
    System.out.println("[회원]");
    System.out.println();
    
    
    // 1번
    System.out.print("번호? ");
    number[0] = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
    keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
    
    System.out.print("이름? ");
    name[0] = keyInput.nextLine();
    
    System.out.print("이메일? ");
    email[0] = keyInput.nextLine();
    
    System.out.print("암호? ");
    password[0] = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo[0] = keyInput.nextLine();
    
    System.out.print("전화? ");
    tel[0] = keyInput.nextInt();
    keyInput.nextLine();
    
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
    now[0] = new Date(currentMillis);
    System.out.println();
    
    System.out.print("계속 입력하시겠습니까?(y/n)");
    String response = keyInput.nextLine();
    
    if (response.equals("y") || response.equals("Y")) {
      count = count + 1;
      
      // 2번
      System.out.print("번호? ");
      number[1] = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
      keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
      
      System.out.print("이름? ");
      name[1] = keyInput.nextLine();
      
      System.out.print("이메일? ");
      email[1] = keyInput.nextLine();
      
      System.out.print("암호? ");
      password[1] = keyInput.nextLine();
      
      System.out.print("사진? ");
      photo[1] = keyInput.nextLine();
      
      System.out.print("전화? ");
      tel[1] = keyInput.nextInt();
      
      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
      now[1] = new Date(currentMillis);
      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(y/n)");
      response = keyInput.nextLine();
      
      
      if(response.equalsIgnoreCase("y")) {
        count += 1;
        //3번
        System.out.print("번호? ");
        number[2] = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
        keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
        
        System.out.print("이름? ");
        name[2] = keyInput.nextLine();
        
        System.out.print("이메일? ");
        email[2] = keyInput.nextLine();
        
        System.out.print("암호? ");
        password[2] = keyInput.nextLine();
        
        System.out.print("사진? ");
        photo[2] = keyInput.nextLine();
        
        System.out.print("전화? ");
        tel[2] = keyInput.nextInt();
        keyInput.nextLine();
        
        currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
        now[2] = new Date(currentMillis);
        System.out.println();
        
        System.out.print("계속 입력하시겠습니까?(y/n)");
        response = keyInput.nextLine();
        
        
        if (response.equalsIgnoreCase("y")) {
          count++;
          // 4번    
          System.out.print("번호? ");
          number[3] = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
          keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
          
          System.out.print("이름? ");
          name[3] = keyInput.nextLine();
          
          System.out.print("이메일? ");
          email[3] = keyInput.nextLine();
          
          System.out.print("암호? ");
          password[3] = keyInput.nextLine();
          
          System.out.print("사진? ");
          photo[3] = keyInput.nextLine();
          
          System.out.print("전화? ");
          tel[3] = keyInput.nextInt();
          keyInput.nextLine();
          
          currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
          now[3] = new Date(currentMillis);
          System.out.println();
          
          System.out.print("계속 입력하시겠습니까?(y/n)");
          response = keyInput.nextLine();
          
          if(response.equalsIgnoreCase("y")){
            count++;
            //5번
            System.out.print("번호? ");
            number[4] = keyInput.nextInt();    // nextInt()는 입력 값 중에서 숫자만 뽑아간다 
            keyInput.nextLine();                // 숫자 뒤에 남아있는 CR/LF 값 버리기
            
            System.out.print("이름? ");
            name[4] = keyInput.nextLine();
            
            System.out.print("이메일? ");
            email[4] = keyInput.nextLine();
            
            System.out.print("암호? ");
            password[4] = keyInput.nextLine();
            
            System.out.print("사진? ");
            photo[4] = keyInput.nextLine();
            
            System.out.print("전화? ");
            tel[4] = keyInput.nextInt();
            keyInput.nextLine();
            
            currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서 경과된 밀리초
            now[4] = new Date(currentMillis);
            System.out.println();
          }
          
          
        }
        
        
      }
      
      
    }
    
    
    keyInput.close();
    
    System.out.println("----------------------------");
    System.out.printf("%d, %s, %s, %s, %d, %s\n",number[0],name[0],email[0],password[0],tel[0],now[0].toString());
    if (count > 1) {
      System.out.printf("%d, %s, %s, %s, %d, %s\n",number[1],name[1],email[1],password[1],tel[1],now[1].toString());
      if (count > 2) {
        System.out.printf("%d, %s, %s, %s, %d, %s\n",number[2],name[2],email[2],password[2],tel[2],now[2].toString());
        if (count >3) {;  
          System.out.printf("%d, %s, %s, %s, %d, %s\n",number[3],name[3],email[3],password[3],tel[3],now[3].toString());
          if (count > 4) { 
            System.out.printf("%d, %s, %s, %s, %d, %s\n",number[4],name[4],email[4],password[4],tel[4],now[4].toString());
          }
        }
      }
    }
    
  }
}

// 유지 보수 좋게 하기 위해 코딩을 한 번 더 보기 쉽게 
// 정리하는 것 => Refactoring 이라고 한다.
