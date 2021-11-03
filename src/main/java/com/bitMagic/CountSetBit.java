package com.bitMagic;

public class CountSetBit {

    static int countSetBitsM1(int n)
    {
        int count = 0;
        while (n != 0) {
            if (n % 2 != 0)
                count++;
            n = n/2;
        }
        return count;
    }

    static int countSetBitsM2(int n)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    static int []table = new int[256];

    // recursive function to count set bits
    public static void initialize() {

        // To initially generate the table algorithmically:
        table[0] = 0;
        for (int i = 0; i < 256; i++)
        {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    public static int countSetBitsM3(int n)
    {
        return table[n & 0xff] +
                table[(n >> 8) & 0xff] +
                table[(n >> 16) & 0xff] +
                table[n >> 24];
    }

    // Driver function
    public static void main(String[] args) {
        int n = 9;
        System.out.println(countSetBitsM1(n));
        System.out.println(countSetBitsM2(n));

        initialize();
        System.out.println(countSetBitsM3(n));
    }
}
