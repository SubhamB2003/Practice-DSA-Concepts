import java.util.*;

class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        // Your code here

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return -1;
        }

        int pre = 0;
        int sum = (int) Arrays.stream(arr).sum();

        // System.out.print(sum);

        for (int i = 1; i < n; i++) {
            pre += arr[i - 1];
            if ((sum - arr[i] - pre) == pre) {
                return i + 1;
            }
        }

        return -1;

    }
}
