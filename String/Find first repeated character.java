import java.util.*;

class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                ans.append(s.charAt(i));
                break;
            } else {
                set.add(s.charAt(i));
            }
        }

        return ans.length() != 0 ? ans.toString() : "-1";
    }
}