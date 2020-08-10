package org.example.pj23_DesignerPDFViewer;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static int designerPdfViewer(int[] h, String word) {
        Map<Character, Integer> alphabetHeight = new HashMap<>();

        int sizeH = h.length;

        char c;
        int i;

        for (c = 'a', i = 0; c <= 'z' && i < sizeH; ++c, i++) {
            alphabetHeight.put(c, h[i]);
        }

        int sizeWord = word.length();

        int max = 0;

        for (int j = 0; j < sizeWord; j++) {
            if (max < alphabetHeight.get(word.charAt(j))) {
                max = alphabetHeight.get(word.charAt(j));
            }
        }

        return max * sizeWord;

    }
}
