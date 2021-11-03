package com.recursion;

public class WritingBaseCasesInRecursion {

    static int nthFib(int n)
    {
        if(n<=1)
            return n;

        return nthFib(n-1) + nthFib(n-2);
    }

    static int factorial(int n)
    {
        if(n==0)
            return 1;

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(nthFib(n));
        System.out.println(factorial(n));
    }
}
