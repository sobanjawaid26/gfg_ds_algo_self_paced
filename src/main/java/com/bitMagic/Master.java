package com.bitMagic;

public class Master {

    public static void main(String[] args) {
        int x = 5;
        int y = 3; //....0011
        int z = 32; //...100001-
        System.out.println("~x " + ~x);
        System.out.println(y<<1); //...0110 -> 6
        System.out.println(y<<2); //...1100 -> 12
        System.out.println(y<<3); //..11000 -> 24
        System.out.println(y<<4); //.110000 -> 48

        System.out.println(z>>2);

        // XOR
        System.out.println(x ^ y);
        // OR
        System.out.println(x | y);
        // AND
        System.out.println(x & y);

        // XOR of a number with itslef is 0
        System.out.println(x ^ x ^ y ^ y ^ x ^ x ^ x ^ x ^ y ^ y ^ x ^ x ^ y ^ 9);

        // Left shift with negative
        x = -1;
        System.out.println(x << 1);
        // Left Shift
        x = 3;
        System.out.println(x << 1);
        System.out.println(x << 2);
        y = 4;
        z = (x << y);
        System.out.println(z);
        // Bitwise Not
        x = 1;
        System.out.println(~ x);
        // Unsigned Right shift
        x = -2;
        System.out.println(x >>> 1);
        // Right shift with negative
        x = -2;
        System.out.println(x >> 1);
        // Right shift
        x = 33;
        System.out.println(x >> 2);
        // right shift
        x = 33;
        System.out.println(x >> 1);
    }
}
