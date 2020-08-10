package org.example.pj13_MigratoryBirds;

import java.util.*;

public class Main {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> typemap = new HashMap<>();
        for (Integer type : arr) {
            typemap.put(type, typemap.containsKey(type) ? typemap.get(type) + 1 : 1);
        }

        int max = Collections.max(typemap.values());

        return typemap.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .min(Comparator.comparing(Map.Entry::getKey)).get().getKey();
    }
}
