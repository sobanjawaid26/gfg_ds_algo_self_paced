package com.recursion;

public class RecursionOutputPractice {

    static void fun1(int n)
    {
        if(n == 0)
            return;

        System.out.println(n);

        fun1(n - 1);

        System.out.println(n);
    }

    static void fun2(int n)
    {
        if(n == 0)
            return;

        fun2(n - 1);

        System.out.println(n);

        fun2(n - 1);
    }
    public static void main(String [] args)
    {
        fun1(3);
        fun2(3);
    }
}
