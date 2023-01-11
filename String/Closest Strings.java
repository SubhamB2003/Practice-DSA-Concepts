import java.util.*;

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int start = Integer.MAX_VALUE, end = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;

        if (word1 == word2)
            return 0;

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1)) {
                start = i;
            }
            if (s.get(i).equals(word2)) {
                end = i;
            }

            if (start != Integer.MAX_VALUE || end != Integer.MAX_VALUE) {
                ans = Math.min(ans, Math.abs(start - end));
            }

        }

        return ans;
    }
};