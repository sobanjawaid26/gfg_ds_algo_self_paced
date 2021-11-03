package com.bitMagic;

public class IsPower2 {


    static boolean isPow2M1(int n)
    {
        if(n == 0)
            return true;

        return ((n & (n - 1)) == 0);
    }

    static boolean isPow2M2(int n)
    {
        if(n == 0)
            return true;

        while(n != 1)
        {
            if(n % 2 != 0)
                return false;

            n = n / 2;
        }

        return true;
    }
    public static void main (String[] args) {

        int n = 4;
        System.out.println(isPow2M1(n));
        System.out.println(isPow2M2(n));
    }
}
