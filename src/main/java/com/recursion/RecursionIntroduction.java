package com.recursion;

public class RecursionIntroduction {

    static void fun1()
    {
        System.out.println("fun1");
    }

    static void fun2()
    {
        System.out.println("Before fun1");

        fun1();

        System.out.println("After fun1");
    }

    static void funSelfCalled(int n)
    {
        if(n == 0)
            return;

        System.out.println("GFG");

        funSelfCalled(n - 1);
    }

    public static void main (String[] args) {

        System.out.println("Before fun2");
        fun2();
        System.out.println("After fun2");

        System.out.println("First Method Finished =========================");
        // 2nd method

        funSelfCalled(2);

    }
}
