package org.example.pj20_CatsAndAMouse;

public class Main {
    static String catAndMouse(int x, int y, int z) {
        if (x == y) {
            return "Mouse C";
        }

        int catAMouse = Math.abs(x - z);
        int catBMouse = Math.abs(y - z);

        if (catAMouse == catBMouse) {
            return "Mouse C";
        } else if (catAMouse < catBMouse) {
            return "Cat A";
        } else {
            return "Cat B";
        }
    }
}
