package com.company;

public class Positiveornegative {
    public static void main(String[] args) {
        check(0);


    }

    public static void check(int x) {
        if (x < 0) {
            System.out.println("negative");
        }
        else if(x>0) {
            System.out.println("positive");
        }
        else {
            System.out.println("neutral");
        }

    }
}
