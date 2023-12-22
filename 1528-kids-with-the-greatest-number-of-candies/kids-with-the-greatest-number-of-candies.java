import java.util.*;
import java.util.Scanner;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        Boolean[] result = new Boolean[candies.length];
        int max;
        for (int i = 0; i < candies.length; i++) {
            max = candies[i] + extraCandies;
            int flag = 0;
            for (int j = 0; j < candies.length; j++) {
                if (max < candies[j]) {
                    flag++;

                }
            }
            if (flag != 0) {
                result[i] = false;
            } else
                result[i] = true;

        }

        List<Boolean> myList = new ArrayList<>(Arrays.asList(result));

        return myList;
    }

}
