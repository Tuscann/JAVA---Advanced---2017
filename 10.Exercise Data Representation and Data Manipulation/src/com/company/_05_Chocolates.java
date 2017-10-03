package com.company;

import java.util.*; // 80/100

public class _05_Chocolates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer barSize = Integer.parseInt(scan.nextLine());


        List<Integer> list = new ArrayList<>();
        String[] input = scan.nextLine().split(", ");

        for (String anInput : input) {
            list.add(Integer.parseInt(anInput));
        }

        Integer minStudents = Integer.parseInt(scan.nextLine());
        Collections.sort(list);

        Integer min = list.get(0);
        Integer max = list.get(minStudents - 1);

        System.out.printf("Min Difference is %s.", max - min);

    }
}
