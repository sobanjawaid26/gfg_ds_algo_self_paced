package com.bitMagic;

public class OneOddOccuring {

    static int findOddM1(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int count = 0;

            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count % 2 != 0)
                return arr[i];

        }

        return 0;
    }

    static int findOddM2(int arr[], int n)
    {
        int res = 0;

        for(int i = 0; i < n; i++)
        {
            res = res ^ arr[i];
        }

        return res;
    }

    public static void main (String[] args) {

        int arr[]= {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;
        System.out.println(findOddM1(arr, n));

        arr = new int[]{4, 3, 4, 4, 4, 5, 5, 3, 3};
        n = 9;
        System.out.println(findOddM2(arr, n));


    }
}
