package com.eomcs.basic.ex05;

public class Exam0470_test {
 public static void main(String[] args) {
    
    final int css = 0x0001; // 0000 0001
    final int html = 0x0002; // 0000 0010
    final int php = 0x0004; // 0000 0100
    final int python = 0x0008; // 0000 1000
    final int js = 0x0010; // 0001 0000
    final int java = 0x0020; // 0010 0000
    final int cpp = 0x0040; // 0100 0000
    final int c = 0x0080; // 1000 0000
    
    int lang = java | c | cpp | js; //1111 0000
   
    System.out.println("-----------  (1)   -----------");
    
    System.out.printf("css     :%b\n", (lang & css) == css);
    System.out.printf("html    :%b\n", (lang & css) == html);
    System.out.printf("php     :%b\n", (lang & css) == php);
    System.out.printf("python  :%b\n", (lang & css) == python);
    System.out.printf("js      :%b\n", (lang & css) == js);
    System.out.printf("java    :%b\n", (lang & css) == js);
    System.out.printf("cpp     :%b\n", (lang & css) == cpp);
    System.out.printf("c       :%b\n", (lang & css) == c);
    
    System.out.println("-----------  (2)   -----------");
    
    System.out.printf("css     :%b\n", (lang & css) < 0);
    System.out.printf("html    :%b\n", (lang & css) < 0);
    System.out.printf("php     :%b\n", (lang & css) < 0);
    System.out.printf("python  :%b\n", (lang & css) < 0);
    System.out.printf("js      :%b\n", (lang & css) < 0);
    System.out.printf("java    :%b\n", (lang & css) < 0);
    System.out.printf("cpp     :%b\n", (lang & css) < 0);
    System.out.printf("c       :%b\n", (lang & css) < 0);
    
    System.out.println("-----------  (3)   -----------");
    
    System.out.printf("css     :%b\n", (lang & css) != 0);
    System.out.printf("html    :%b\n", (lang & css) != 0);
    System.out.printf("php     :%b\n", (lang & css) != 0);
    System.out.printf("python  :%b\n", (lang & css) != 0);
    System.out.printf("js      :%b\n", (lang & css) != 0);
    System.out.printf("java    :%b\n", (lang & css) != 0);
    System.out.printf("cpp     :%b\n", (lang & css) != 0);
    System.out.printf("c       :%b\n", (lang & css) != 0);
  }
}
