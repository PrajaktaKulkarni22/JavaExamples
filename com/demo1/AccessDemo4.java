package com.demo1;

import com.demo.AccessDemo;

public class AccessDemo4 {
    public static void main(String[] args) {
        System.out.println("Outside class different package");
        AccessDemo ad=new AccessDemo();
    //    System.out.println("Private:"+ad.a);              private cannot be accessed
    //    System.out.println("Default:"+ad.b);              default cannot be accessed
    //    System.out.println("Protected:"+ad.c);            protected cannot be accessed
        System.out.println("Public:"+ad.d);                //only public can be accessed

    }
}
