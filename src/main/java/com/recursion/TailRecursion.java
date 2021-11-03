package com.recursion;

public class TailRecursion {


    static void fun1(int n)
    {
        if(n == 0)
            return;

        System.out.print(n+" ");

        fun1(n - 1);

    }

    static void fun2(int n, int k)
    {
        if(n == 0)
            return;

        System.out.print(k+" ");

        fun2(n - 1, k + 1);

    }

    static int fact(int n, int k)
    {
        if(n == 0 || n == 1)
            return k;

        return fact(n - 1, k * n);

    }

    public static void main(String [] args)
    {
        fun1(3);
        fun2(3,1);
        System.out.println(fact(3, 1));

    }
}
