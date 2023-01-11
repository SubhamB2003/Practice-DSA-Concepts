import java.util.*;

class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {

        if (m > n)
            return "No";

        HashMap<Long, Integer> map = new HashMap<>();

        for (long e : a2) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        for (long e : a1) {
            if (map.containsKey(e)) {
                int c = map.get(e) - 1;

                if (c == 0) {
                    map.remove(e);
                } else {
                    map.put(e, c);
                }
            }
        }

        return map.isEmpty() ? "Yes" : "No";
    }
}