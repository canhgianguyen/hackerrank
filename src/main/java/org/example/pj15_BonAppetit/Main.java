package org.example.pj15_BonAppetit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = bill.stream()
                .filter(e -> e != bill.get(b))
                .collect(Collectors.summingInt(Integer::intValue));
        if ((sum / 2) == k) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(k - (sum / 2));
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(3, 10, 2, 9));
        bonAppetit(a, 12, 1);
    }
}
