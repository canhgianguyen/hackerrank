package org.example.pj25_AngryProfessor;

public class Main {
    static String angryProfessor(int k, int[] a) {
        int onTime = 0;
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (a[i] <= 0) {
                onTime++;
            }
        }

        if (onTime >= k) {
            return "NO";
        }
        return "YES";
    }
}
