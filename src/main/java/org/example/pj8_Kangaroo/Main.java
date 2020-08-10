package org.example.pj8_Kangaroo;

public class Main {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2) {
            if ((x2 - x1) % (v1 - v2) == 0) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(4523, 8092, 9419, 8067));
    }
}
