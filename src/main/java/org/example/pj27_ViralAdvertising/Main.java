package org.example.pj27_ViralAdvertising;

public class Main {
    static int viralAdvertising(int n) {
        int shared = 5;
        int cumulative = 2;

        if (n == 1) {
            return cumulative;
        }

        for (int i = 2; i <= n; i++) {
            shared = (shared / 2) * 3;
            cumulative += shared / 2;
        }

        return cumulative;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }
}
