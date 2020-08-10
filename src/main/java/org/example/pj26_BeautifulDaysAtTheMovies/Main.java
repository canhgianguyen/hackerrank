package org.example.pj26_BeautifulDaysAtTheMovies;

public class Main {
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int s = i; s <= j; s++) {
            if (Math.abs(s - getReverse(s)) % k == 0) {
                count++;
            }
        }
        return count;
    }

    static int getReverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
}
