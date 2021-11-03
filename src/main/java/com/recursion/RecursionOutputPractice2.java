package com.recursion;

public class RecursionOutputPractice2 {

    static void fun1(int n)
    {
        if(n == 0)
            return;

        fun1(n / 2);

        System.out.println(n % 2);

    }

    static int fun2(int n)
    {
        if(n == 1)
            return 0;
        else
            return 1 + fun2(n / 2);
    }

    public static void main(String [] args)
    {
        fun1(7);
        System.out.println(fun2(16));

    }
}
