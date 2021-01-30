package com.demo;

public class AccessDemo {
        private int a=50;
        int b=10;
        protected int c=20;
        public int d=100;
    }

    class AccessSpecifierDemo1 {
        public static void main(String[] args) {
            AccessDemo as = new AccessDemo();
            System.out.println("Outside class same package");

            // System.out.println("Private variable:"+as.a);
            System.out.println("Default variable:" + as.b);
            System.out.println("Protected variable:" + as.c);
            System.out.println("Public variable:" + as.d);

        }
    }


