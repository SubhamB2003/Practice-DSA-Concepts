import java.util.*;

class GFG {
    long maxSum(long arr[], int n) {
        long sum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sum += Math.abs(arr[n - i - 1] - arr[i]);
        }

        return sum;
    }
}
