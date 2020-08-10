package org.example.pj11_Birthday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        int size = s.size();
        for (int i = 0; i <= size - m; i++) {
            int sum = 0;
            int count = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
                count++;
                if (sum == d && count == m) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(4));
        System.out.println(birthday(a, 4, 1));
    }
}
