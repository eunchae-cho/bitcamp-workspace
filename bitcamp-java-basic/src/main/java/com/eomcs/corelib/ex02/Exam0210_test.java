package com.eomcs.corelib.ex02;

public class Exam0210_test {
  public static void main(String[] args) {
    // Wrapper Class
    Byte b = new Byte((byte)100);
    Short s = new Short((short)20000);
    Integer i = new Integer(3000000);
    Long l = new Long(600000000L);
    Float f = new Float(3.14f);
    Double d = new Double(3.14159);
    Boolean bool = new Boolean(true);
    Character c = new Character((char)0x41);

    Byte b2 = Byte.valueOf((byte)100);
    Short s2 = Short.valueOf((short)20000);
    Integer i2 = Integer.valueOf(3000000);
    Long l2 = Long.valueOf(600000000L);
    Float f2 = Float.valueOf(3.14f);
    Double d2 = Double.valueOf(3.14159);
    Boolean bool2 = Boolean.valueOf(true);
    Character c2 = Character.valueOf((char)0x41);

    }

  void m1(Object value) {
    System.out.printf("value = %s\n",value);
  }

  void m2(long value) {
    System.out.printf("value = %s\n",value);
  }

  void m3(double value) {
    System.out.printf("value = %s\n",value);
  }

  void m4(boolean value) {
    System.out.printf("value = %s\n",value);
  }
}

