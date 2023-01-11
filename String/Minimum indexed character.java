import java.util.*;

class Solution {
    // Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt) {
        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            }
        }

        for (int i = 0; i < patt.length(); i++) {
            char currCh = patt.charAt(i);
            if (map.containsKey(currCh)) {
                min = Math.min(map.get(currCh), min);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}