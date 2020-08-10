package com.eomcs.oop.ex04;

public class Exam0113 {
  public static void main(String[] args) throws Exception {
    byte[] bytes = {
        (byte)0x41,
        (byte)0x42,
        (byte)0x43,
        (byte)0x61,
        (byte)0x62,
        (byte)0x63,
        (byte)0x30,
        (byte)0x31,
        (byte)0x32,
        (byte)0x20,
        (byte)0x21,
        (byte)0x23,
        (byte)0x25,
        (byte)0x2b,
        (byte)0xea, (byte)0xb0, (byte)0x80,
        (byte)0xea, (byte)0xb0, (byte)0x81,
        (byte)0xeb, (byte)0x98, (byte)0x98,
        (byte)0xeb, (byte)0x98, (byte)0xa5
    };

    String s1 = new String(bytes);
    System.out.println(s1);
  }

}
