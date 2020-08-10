package org.example.pj4_PlusMinus;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                positiveNum++;
            } else if (arr[i] < 0) {
                negativeNum++;
            } else {
                zeroNum++;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.println(decimalFormat.format(positiveNum / (float) size));
        System.out.println(decimalFormat.format(negativeNum / (float) size));
        System.out.println(decimalFormat.format(zeroNum / (float) size));
    }
}
