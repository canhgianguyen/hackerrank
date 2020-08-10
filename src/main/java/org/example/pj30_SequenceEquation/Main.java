package org.example.pj30_SequenceEquation;

public class Main {
    static int[] permutationEquation(int[] p) {
        int size = p.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = findIndex(p, findIndex(p, i + 1) + 1) + 1;
        }
        return result;
    }

    static int findIndex(int[] arr, int key) {
        int size = arr.length;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] p = new int[] {2, 3, 1};
        permutationEquation(p);
    }
}
