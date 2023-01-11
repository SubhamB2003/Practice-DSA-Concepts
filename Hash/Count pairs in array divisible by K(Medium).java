import java.util.*;

class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
        // code here
        long cnt = 0;
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            long rem = arr[i] % k;

            if (map.containsKey(k - rem)) {
                cnt += map.get(k - rem);
            }

            if (rem == 0) {
                rem = k;
            }

            map.put(rem, map.getOrDefault(rem, 0L) + 1);
        }
        return cnt;

    }
}