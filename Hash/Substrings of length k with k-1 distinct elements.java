import java.util.*;

class Solution {
    static int countOfSubstrings(String s, int k) {
        // code here
        int n = s.length(), ans = 0, i = 0, j = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (i < n) {
            if (i - j + 1 <= k) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                i++;
            } else {
                if (map.size() == k - 1) {
                    ans++;
                }

                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);

                if (map.get(s.charAt(j)) == 0) {
                    map.remove(s.charAt(j));
                }
                j++;
            }
        }

        if (map.size() == k - 1) {
            ans++;
        }

        return ans;

    }
};