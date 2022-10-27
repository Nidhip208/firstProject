package com.company;

public class Calculator{

    public static void main(String[] args) {
        System.out.println("sum is " + add(10,6) + " Substraction is " + sub(10,6));
        System.out.println(multiplication(19,37));


    }

    public static int add(int a, int b)
    {
     int sum = a +b;
        return sum;
    }

    public static int sub(int a, int b)
    {
        int subt = a - b;
        return subt;

    }

    public static int multiplication(int a, int b)
    {
        int mul= a*b;
        return mul;
    }
}
