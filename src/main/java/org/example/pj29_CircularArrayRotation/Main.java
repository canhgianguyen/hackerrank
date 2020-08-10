package org.example.pj29_CircularArrayRotation;

public class Main {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        for (int i = 1; i <= k; i++) {
            rotateArray(a);
        }

        int size = queries.length;

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = a[queries[i]];
        }
        return result;
    }

    static int[] rotateArray(int[] arr) {
        int size = arr.length - 1;
        int last = arr[size];

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[] {3, 1, 2};
        int[] query = new int[] {0, 1, 2};

        System.out.println(circularArrayRotation(a, 2, query));
    }
}
