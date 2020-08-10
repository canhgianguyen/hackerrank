package org.example.pj21_FormingAMagicSquare;

import java.util.*;

public class Main {


    static int formingMagicSquare(int[][] s) {
        Map<Integer, Integer> angle = new HashMap<>();
        angle.put(8, 2);
        angle.put(2, 8);
        angle.put(4, 6);
        angle.put(6, 4);
        List<Integer> angleList = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        Map<Integer, Integer> middle = new HashMap<>();
        middle.put(3, 7);
        middle.put(7, 3);
        middle.put(1, 9);
        middle.put(9, 1);
        List<Integer> middleList = new ArrayList<>(Arrays.asList(1, 3, 7, 9));

        // s[0][0]   s[0][1]   s[0][2]

        // s[1][0]   s[1][1]   s[1][2]

        // s[2][0]   s[2][1]   s[2][2]

        int cost = 0;
        int[][] costArr = new int[][] {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        if (s[1][1] != 5) {
            cost += Math.abs(s[1][1] - 5);
            costArr[1][1] = cost;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break;
                }
                if (s[i][j] != s[2 - i][2 - j]) {
                    if (((i + j) % 2 == 0)
                            && angle.containsKey(s[i][j]) && angle.containsKey(s[2 - i][2 - j])) {
                        costArr[i][j] = -1;
                        costArr[2 - i][2 - j] = -1;

                        angle.remove(s[i][j]);
                        angle.remove(s[2 - i][2 - j]);
                    }
                    if (((i + j) % 2 != 0)
                            && middle.containsKey(s[i][j]) && middle.containsKey(s[2 - i][2 - j])) {
                        costArr[i][j] = -1;
                        costArr[2 - i][2 - j] = -1;

                        middle.remove(s[i][j]);
                        middle.remove(s[2 - i][2 - j]);
                    }
                }
            }
        }



        countCost(angle, s, costArr, 0, 0, 2, 2);
        countCost(angle, s, costArr, 0, 2, 2, 0);
        countCost(angle, s, costArr, 2, 2, 0, 0);
        countCost(angle, s, costArr, 2, 0, 0, 2);
        countCost(middle, s, costArr, 0, 1, 2, 1);
        countCost(middle, s, costArr, 1, 2, 1, 0);
        countCost(middle, s, costArr, 2, 1, 0, 1);
        countCost(middle, s, costArr, 1, 0, 1, 2);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                System.out.print(s[i][j] + "   ");
                if (costArr[i][j] > 0) {
                    cost += costArr[i][j];
                }
            }
//            System.out.println();
        }

        return cost;
    }

    static void countCost(Map<Integer, Integer> map, int[][] s, int[][] costArr, int x, int y, int oppositeX, int oppositeY) {
        if (costArr[x][y] == 0) {
            if (map.containsKey(s[x][y])) {
                if (s[oppositeX][oppositeY] == map.get(s[x][y])) {
                    costArr[x][y] = -1;
                    costArr[oppositeX][oppositeY] = -1;

                    map.remove(s[x][y]);
                    map.remove(s[oppositeX][oppositeY]);
                } else {
                    costArr[x][y] = -1;
                    costArr[oppositeX][oppositeY] = Math.abs(s[oppositeX][oppositeY] - map.get(s[x][y]));

                    s[oppositeX][oppositeY] = map.get(s[x][y]);

                    map.remove(s[x][y]);
                    map.remove(s[oppositeX][oppositeY]);
                }
            } else if (map.containsKey(s[oppositeX][oppositeY])) {
                costArr[oppositeX][oppositeY] = -1;
                costArr[x][y] = Math.abs(s[x][y] - map.get(s[oppositeX][oppositeY]));

                s[x][y] = map.get(s[oppositeX][oppositeY]);

                map.remove(s[oppositeX][oppositeY]);
                map.remove(s[x][y]);
            } else if (costArr[x][y] == 0 && costArr[oppositeX][oppositeX] == 0) {
                int min1 = 10;
                int key1 = 0;

                for (Integer num : map.keySet()) {
                    if (Math.abs(s[x][y] - num) < min1) {
                        min1 = Math.abs(s[x][y] - num);
                        key1 = num;
                    }
                }

                int min2 = 10;
                int key2 = 0;

                for (Integer num : map.keySet()) {
                    if (Math.abs(s[oppositeX][oppositeY] - num) < min1) {
                        min2 = Math.abs(s[x][y] - num);
                        key2 = num;
                    }
                }

                if (min1 < min2) {
                    costArr[x][y] = min1;
                    s[x][y] = key1;
                    map.remove(key1);
                } else {
                    costArr[oppositeX][oppositeY] = min2;
                    s[oppositeX][oppositeY] = key2;
                    map.remove(key2);
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[][] a = new int[][] {{1, 3, 8},
//                                 {6, 4, 1},
//                                 {2, 6, 5}};

//        int[][] a = new int[][] {{4, 8, 2},
//                                 {4, 5, 7},
//                                 {6, 1, 6}};

//        int[][] a = new int[][] {{4, 9, 2},
//                                 {3, 5, 7},
//                                 {8, 1, 5}};

        int[][] a = new int[][] {{2, 2, 7},
                                 {8, 6, 4},
                                 {1, 2, 9}};

        System.out.println(formingMagicSquare(a));
    }
}
