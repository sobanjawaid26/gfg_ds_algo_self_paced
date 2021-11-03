package com.bitMagic;

public class BitSetOrNot {

    public static void isKthBitSetM1(int n, int k) {
        if ((n & (1 << (k - 1))) == 1)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }

    static void isKthBitSetM2(int n, int k) {
        if (((n >> (k - 1)) &
                1) == 1)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }

    // Driver code
    public static void main (String[] args) {
        int n = 5, k = 1;
        isKthBitSetM1(n, k);
        isKthBitSetM2(n, k);
    }
}
