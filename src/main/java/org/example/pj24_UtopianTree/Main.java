package org.example.pj24_UtopianTree;

public class Main {
    static int utopianTree(int n) {
        if (n == 0) {
            return 1;
        }
        int height = 1;
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            if (flag) {
                height *= 2;
                flag = false;
            } else {
                height++;
                flag = true;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(4));
    }
}
