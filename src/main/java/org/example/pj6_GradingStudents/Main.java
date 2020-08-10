package org.example.pj6_GradingStudents;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedNum = new ArrayList<>();
        for (Integer integer : grades) {
            roundedNum.add(roundingNum(integer));
        }
        return roundedNum;
    }

    public static int roundingNum(int num) {
        if (num < 38 || (num % 5 == 0))
            return num;
        int temp = num;
        int count = 0;
        while (num % 5 != 0) {
            num++;
            count++;
        }
        if ((num % 5 == 0) && count < 3) {
            return num;
        } else {
            return temp;
        }
    }
}
