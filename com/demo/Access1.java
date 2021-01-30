package com.demo;

public class Access1 {
    private int a=10;
    int b=50;
    protected int c=40;
    public int d=100;

    public static void main(String[] args) {
        Access1 a1=new Access1();
        System.out.println("Same class ");
        System.out.println("Private variable:"+a1.a);
        System.out.println("Default variable:"+a1.b);
        System.out.println("Protected variable:"+a1.c);
        System.out.println("Public variable:"+a1.d);

    }
}
