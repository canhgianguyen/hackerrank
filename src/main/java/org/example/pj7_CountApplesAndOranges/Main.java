package org.example.pj7_CountApplesAndOranges;

public class Main {
    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesSize = apples.length;
        int orangesSize = oranges.length;

        int applesCount = 0;
        int orangesCount = 0;


        for (int i = 0; i < applesSize; i++) {
            if (apples[i] + a >= s && apples[i] + a <= t) {
                applesCount++;
            }
        }

        for (int i = 0; i < orangesSize; i++) {
            if (oranges[i] + b >= s && oranges[i] + b <= t) {
                orangesCount++;
            }
        }

        System.out.println(applesCount);
        System.out.println(orangesCount);
    }
}
