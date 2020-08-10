package org.example.pj31_ClimbingTheLeaderboard;

import java.util.stream.IntStream;

public class Main {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        scores = IntStream.of(scores).distinct().toArray();

        int scoreSize = scores.length;
        int aliceSize = alice.length;

        int[] position = new int[aliceSize];

//        for (int i = 0; i < aliceSize; i++) {
//            for (int j = 0; j < scoreSize; j++) {
//                if (alice[i] >= scores[j]) {
//                    position[i] = j + 1;
//                    break;
//                }
//            }
//            if (position[i] == 0) {
//                position[i] = scoreSize + 1;
//            }
//        }

        int[] array = java.util.stream.IntStream.of(scores).distinct().toArray();
        int i = array.length - 1;
        for (int j = 0; j < aliceSize; j++) {
            while (i >= 0) {
                if (alice[j] >= array[i]) i--;
                else {
                    position[j] = i + 2;
                    break;
                }
            }
            if (i < 0) position[j] = 1;
        }

        return position;
    }


    public static void main(String[] args) {
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
        int[] alice = new int[]{5, 25, 50, 120};

        climbingLeaderboard(scores, alice);
    }
}
