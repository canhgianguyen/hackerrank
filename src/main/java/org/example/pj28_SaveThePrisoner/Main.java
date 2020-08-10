package org.example.pj28_SaveThePrisoner;

public class Main {
    static int saveThePrisoner(int n, int m, int s) {
        int remainder = m % n;

        int pos = s + remainder - 1;

        if (pos > n) {
            return pos % n;
        } else if (pos == 0) {
            return n;
        }

        return pos;
    }

    public static void main(String[] args) {
//        System.out.println(saveThePrisoner(14, 828540146, 13));
//        System.out.println(saveThePrisoner(7, 19, 2));
//        System.out.println(saveThePrisoner(3, 7, 3));
//        System.out.println(saveThePrisoner(144, 797951344, 1));
//        System.out.println(saveThePrisoner(78, 631228415, 77));
//        System.out.println(saveThePrisoner(17, 900306316, 1));
//        System.out.println(saveThePrisoner(999999998, 199360437, 1));
//        System.out.println(saveThePrisoner(91, 111224659, 1));
//        System.out.println(saveThePrisoner(999999998, 999999997, 1));
//        System.out.println(saveThePrisoner(169, 647839529, 169));
        System.out.println(saveThePrisoner(15, 855047220, 12));
//        System.out.println(saveThePrisoner(5, 815446299, 4));
//        System.out.println(saveThePrisoner(5, 815446299, 4));
//        System.out.println(saveThePrisoner(5, 815446299, 4));
//        System.out.println(saveThePrisoner(5, 815446299, 4));
//        System.out.println(saveThePrisoner(5, 815446299, 4));
//        System.out.println(saveThePrisoner(5, 815446299, 4));


    }
}
