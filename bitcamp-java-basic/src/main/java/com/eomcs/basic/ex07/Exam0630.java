package com.eomcs.basic.ex07;
// JVM 아규먼트 응용 II

public class Exam0630 {
  public static void main(String[] args) {

    java.util.Properties props = System.getProperties();

    java.util.Set keySet = props.keySet();

    for(Object key : keySet) {
      String value = System.getProperty((String)key);
      System.out.printf("%s = %s\n",key,value);
    }
  }
}
