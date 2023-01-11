import java.util.*;

class Solution {
    // Function to perform case-specific sorting of strings.
    public static String caseSort(String str) {
        // Your code here
        PriorityQueue<Character> lower = new PriorityQueue<>();
        PriorityQueue<Character> upper = new PriorityQueue<>();

        for (char e : str.toCharArray()) {
            if (Character.isLowerCase(e)) {
                lower.offer(e);
            } else {
                upper.offer(e);
            }
        }

        char[] ans = new char[str.length()];
        int i = 0;
        for (char e : str.toCharArray()) {
            if (Character.isLowerCase(e)) {
                ans[i++] = lower.poll();
            } else {
                ans[i++] = upper.poll();
            }
        }

        return new String(ans);

    }
}