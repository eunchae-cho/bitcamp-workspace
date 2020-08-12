package com.eomcs.oop.ex07.b;

import com.eomcs.oop.ex07.b.sub.B;
import com.eomcs.oop.ex07.b.sub.C;

public class Exam0210 extends C {

  public static void main(String[] args) {
    A obj1 = new A();
    obj1.defaultVar = 100;
    obj1.protectedVar = 100;
    obj1.publicVar = 100;

    B obj2 = new B();
    obj2.publicVar = 100;

    C obj3 = new C();
    //obj3.protectedVar = 100;
    obj3.publicVar = 100;

    Exam0210 obj4 = new Exam0210();
    obj4.protectedVar = 100;
    obj4.publicVar = 100;
  }

  void m1(C obj3) {
    //obj3.protected = 100;
    obj3.publicVar = 100;
  }

  void m2(Exam0210 obj4) {
    obj4.protectedVar = 100;
    obj4.publicVar = 100;
  }

  void m3() {
    this.protectedVar = 100;
    this.publicVar = 100;
  }

}
