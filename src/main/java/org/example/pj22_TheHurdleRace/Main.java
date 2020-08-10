package org.example.pj22_TheHurdleRace;

import java.util.Arrays;

public class Main {
    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        int max = height[height.length - 1];

        if (k >= max) {
            return 0;
        }
        return Math.abs(k - max);
    }
}
