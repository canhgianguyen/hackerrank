package org.example.pj10_BreakingRecords;

public class Main {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int games = scores.length;
        int[] highestScore = new int[games];
        int[] lowestScore = new int[games];

        highestScore[0] = scores[0];
        lowestScore[0] = scores[0];

        for (int i = 1; i < games; i++) {
            if (highestScore[i - 1] < scores[i]) {
                highestScore[i] = scores[i];
            } else {
                highestScore[i] = highestScore[i - 1];
            }

            if (lowestScore[i - 1] > scores[i]) {
                lowestScore[i] = scores[i];
            } else {
                lowestScore[i] = lowestScore[i - 1];
            }
        }

        int highScoreCount = getCount(highestScore);
        int lowScoreCount = getCount(lowestScore);

        return new int[] {highScoreCount, lowScoreCount};
    }

    public static int getCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
