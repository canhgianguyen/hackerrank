package org.example.pj9_GetTotalX;

import java.util.*;

public class Main {
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int min = Collections.min(a);
        int max = Collections.max(b);

        int count = 0;
        for (int i = min; i <= max; i++) {
            if (hasFactor(i, a) && isFactor(i, b)) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasFactor(int num, List<Integer> list) {
        for (Integer e : list) {
            if (num % e != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFactor(int num, List<Integer> list) {
        for (Integer e : list) {
            if (e % num != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a, b));
    }
}
