package com.company;

import java.util.Scanner;

public class _04_Combinations_Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer n = Integer.parseInt(scan.nextLine());
        Integer k = Integer.parseInt(scan.nextLine());

        Long x = binomial(n, k);

        System.out.printf("%d%n",x );

//        int i, factN = 1, factNK = 1, factK = 1;
//
//        for (i = 1; i <= n; i++) {
//            factN = factN * i;
//        }
//        for (i = 1; i <= n - k; i++) {
//            factNK = factNK * i;
//        }
//        for (i = 1; i <= k; i++) {
//            factK = factK * i;
//        }
//
//        Integer sum = factN / factNK * factK;
//
//        System.out.print(sum);

    }

    private static long binomial(int n, int k) {
        if (k > n - k)
            k = n - k;

        long b = 1;
        for (int i = 1, m = n; i <= k; i++, m--)
            b = b * m / i;
        return b;
    }
}
