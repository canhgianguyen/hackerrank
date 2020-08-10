package org.example.pj14_DayOfProgrammer;

public class Main {
    static String dayOfProgrammer(int year) {
        if (year == 1918) {
            return "26.09.1918";
        }
        if (isLeapYear(year)) {
            return "12.09." + year;
        }
        return "13.09." + year;
    }

    static boolean isLeapYear(int year) {
        if (year < 1918) {
            if (year % 4 == 0) {
                return true;
            }
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
        return false;
    }
}
