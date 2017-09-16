package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;      //100/100
import java.util.function.Function;

public class _03_Custom_Min_Function {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Function<int[], Integer> extractMin = nums -> {
            int min = nums[0];
            for (Integer num : nums) {
                if (num < min)
                    min = num;
            }

            return min;
        };

        String[] numAsString = in.readLine().split("\\s+");
        int[] nums = new int[numAsString.length];

        int index = 0;
        for (String str : numAsString) {
            nums[index++] = Integer.parseInt(str);
        }

        int min = extractMin.apply(nums);
        System.out.println(min);
    }
}
