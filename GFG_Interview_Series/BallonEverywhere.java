import java.util.*;

class Solution {
    public int maxInstance(String s) {
        // Code here
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();

        String x = "balloon";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'l'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'n') {
                map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        for (int i = 0; i < x.length(); i++) {
            map2.put(x.charAt(i), map2.getOrDefault(x.charAt(i), 0) + 1);
        }

        int c = 0;

        if (map1.size() != map2.size()) {
            c = 0;
        } else {
            int min = Collections.min(map1.values());
            int max = Collections.max(map1.values());

            for (Map.Entry<Character, Integer> e : map1.entrySet()) {
                if (e.getValue() == map2.get(e.getKey())) {
                    c = 1;
                }
            }

            if (map1.get('l') == max && map1.get('o') == max) {
                c = max / 2;
            } else {
                int temp = Math.min(map1.get('l'), map1.get('o'));
                if (temp <= min) {
                    c = temp / 2;
                } else {
                    int diff = temp / 2;

                    if (diff <= min) {
                        c = diff;
                    } else {
                        c = min;
                    }
                }
            }
        }

        return c;
    }
}