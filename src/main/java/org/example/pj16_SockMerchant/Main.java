package org.example.pj16_SockMerchant;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sockMap = new HashMap<>();
        for (Integer sock : ar) {
            sockMap.put(sock, sockMap.containsKey(sock) ? sockMap.get(sock) + 1 : 1);
        }
        return sockMap.values().stream().mapToInt(integer -> integer / 2).sum();
    }
}
