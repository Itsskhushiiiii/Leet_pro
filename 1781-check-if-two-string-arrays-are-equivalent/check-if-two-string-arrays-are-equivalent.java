import java.util.*;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word_1 = "";
        String word_2 = "";
        for (int i = 0; i < (word1.length); i++) {
            word_1 += word1[i];
        }
        for (int j = 0; j < (word2.length); j++) {
            word_2 += word2[j];
        }
        return word_1.equals(word_2);
    }
}