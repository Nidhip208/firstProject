package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        System.out.println("0");
        for(int k=0;k<10;k++){
            System.out.println(c=a+b );
            a=b;
            b=c;
        }
    }
}
