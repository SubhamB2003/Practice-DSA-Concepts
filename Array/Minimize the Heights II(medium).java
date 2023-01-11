import java.util.*;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);

        int min = arr[0] + k;
        int max = arr[n - 1] - k;

        int ans = arr[n - 1] - arr[0];
        int minimum, maximum;

        for (int i = 0; i < n - 1; i++) {
            minimum = Math.min(min, arr[i + 1] - k);
            maximum = Math.max(max, arr[i] + k);

            if (minimum < 0) {
                continue;
            }

            ans = Math.min(ans, maximum - minimum);

        }

        return ans;
    }
}
