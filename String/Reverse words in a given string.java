import java.util.*;

// Expected Time Complexity: O(|S|)
// Expected Auxiliary Space: O(|S|)

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String S) {
        // code here
        String[] str = S.split("\\.");

        List<String> strList = Arrays.asList(str);
        Collections.reverse(strList);

        StringBuffer sb = new StringBuffer();
        for (String s : strList) {
            sb.append(s + ".");
        }

        return sb.substring(0, sb.length() - 1).toString();
    }
}
