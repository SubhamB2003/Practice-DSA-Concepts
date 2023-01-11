import java.util.*;

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

class Solution {
    static int majorityElement(int a[], int size) {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        int ans = 0;
        int max = Collections.max(map.values());

        for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                ans = entry.getKey();
                break;
            }
        }

        if (max <= size / 2) {
            ans = -1;
        }

        return ans;
    }
}