import java.util.*;
import java.util.Map.*;

// Expected Time Complexity: O(log N)
// Expected Auxiliary Space: O(1)

class Solution {
    int findOnce(int arr[], int n) {
        // Complete this function
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int ans = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
                break;
            }
        }

        return ans;
    }
}