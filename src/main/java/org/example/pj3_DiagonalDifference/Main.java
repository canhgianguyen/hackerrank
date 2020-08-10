package org.example.pj3_DiagonalDifference;

import java.util.List;

public class Main {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int size = arr.size();
        int primaryDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < size; i++) {
            List<Integer> subList = arr.get(i);
            primaryDiagonal += subList.get(i);
            secondDiagonal += subList.get(size - i - 1);
        }
        return Math.abs(primaryDiagonal - secondDiagonal);
    }

}
