package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;          // 100/100
import java.util.function.BiConsumer;

public class _04_Find_Evens_or_Odds {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArgs = in.readLine().split("\\s+");
        int start = Integer.parseInt(inputArgs[0]);
        int end = Integer.parseInt(inputArgs[1]);
        boolean searchOdds = in.readLine().toLowerCase().equals("odd");

        BiConsumer<Integer, Integer> searcher = (s, e) -> {
            for (int i = s; i <= e; i++) {
                if (searchOdds && i % 2 != 0)
                    System.out.print(i + " ");
                else if (!searchOdds && i % 2 == 0)
                    System.out.print(i + " ");
            }
        };

        searcher.accept(start, end);
    }
}
