package com.demo1;

import com.demo.AccessDemo;

public class AccessDemo1 extends AccessDemo {
    public static void main(String[] args) {
        AccessDemo1 as1=new AccessDemo1();
        System.out.println("Outside class different package (subclass)");
        //System.out.println("Private:"+as1.a);               Private cannot be accessed
      //  System.out.println("Default:"+as1.b);                 default cannot be accessed
        System.out.println("Protected:"+as1.c);
        System.out.println("Public:"+as1.d);

    }
}
