package org.example.pj18_CountingValleys;

public class Main {
    static int countingValleys(int n, String s) {
        String[] path = s.split("");
        int seaLevel = 0;
        int count = 0;
        for (String step : path) {
            if ("U".equals(step)) {
                seaLevel++;
            } else {
                if (seaLevel == 0) {
                    count++;
                }
                seaLevel--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(1, "DDUUDDUDUUUD"));
    }
}
