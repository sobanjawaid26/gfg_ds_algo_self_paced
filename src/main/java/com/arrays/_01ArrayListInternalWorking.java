package com.arrays;

import java.util.ArrayList;

public class _01ArrayListInternalWorking {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(100);

        for(int i = 0; i<=100; i++){
            al.add(i);
        }
        System.out.println(al);
    }
}
