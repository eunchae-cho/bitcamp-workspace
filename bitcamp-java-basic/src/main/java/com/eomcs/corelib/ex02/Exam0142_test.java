package com.eomcs.corelib.ex02;

public class Exam0142_test {
  public static void main(String[] args) {
    Object obj = new String("Hello");

    String str = ((String)obj).toLowerCase();
    System.out.println(str);

    String x1 = (String) obj;
    str = x1.toLowerCase();
    System.out.println(str);

    System.out.println(str.equals(x1));
    System.out.println(str == x1);
    System.out.println(obj.equals(x1));
    System.out.println(obj == x1);
    System.out.println(obj.equals(str));
    System.out.println(obj == str);
  }

}
