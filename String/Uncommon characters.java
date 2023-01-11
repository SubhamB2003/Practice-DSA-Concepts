import java.util.*;

class Solution {
    String UncommonChars(String A, String B) {
        // code here
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();

        TreeSet<Character> res = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            set1.add(A.charAt(i));
        }
        for (int i = 0; i < B.length(); i++) {
            set2.add(B.charAt(i));
        }

        for (Character ch : set1) {
            if (!set2.contains(ch)) {
                res.add(ch);
            }
        }

        for (Character ch : set2) {
            if (!set1.contains(ch)) {
                res.add(ch);
            }
        }

        if (res.size() == 0) {
            sb.append(-1);
            return sb.toString();
        }

        Iterator<Character> ch = res.iterator();
        while (ch.hasNext()) {
            sb.append(ch.next());
        }

        return sb.toString();
    }
}