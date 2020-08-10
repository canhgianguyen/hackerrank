package org.example.pj19ElectronicsShop;


public class Main {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int total = 0;
        for (Integer keyboard : keyboards) {
            for (Integer drive : drives) {
                if ((keyboard + drive) <= b && total < (keyboard + drive)) {
                    total = keyboard + drive;
                }
            }
        }
        if (total == 0) {
            return -1;
        }
        return total;
    }
}
