package org.example.pj17_PageCount;

public class Main {
    static int pageCount(int n, int p) {
        if (p == 1 || p == n) {
            return 0;
        }

        int count = 0;
        int flips = n / 2;
        int pages = n /2 + 1;
        // neu sach lat duoc 2 lan
        if (flips == 2) {
            // neu so trang la le va p = n - 1
            if (p == (n - 1) && (pages % 2 != 0)) {
                return 0;
            }
            return 1;
        } else {
            for (int i = 1; i <= n; i += 2) {
                // neu p la i hoac i + 1
                if ((p == i) || (p == i - 1)) {
                    // neu so lan dem > tong so lan dem / 2
                    if (count > (flips / 2)) {
                        count = flips - count;
                        break;
                    }
                    break;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(50, 4));
    }
}
