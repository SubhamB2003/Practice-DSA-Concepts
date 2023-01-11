import java.util.*;

class Solution {

    public static long minSum(int arr[], int n) {
        // Your code goes here
        Arrays.sort(arr);

        long n1 = 0;
        long n2 = 0;

        for (int i = 1; i < n; i = i + 2) {
            n1 = (n1 * 10) + arr[i];
        }

        for (int i = 0; i < n; i = i + 2) {
            n2 = (n2 * 10) + arr[i];
        }

        long ans = n1 + n2;

        return ans;
    }
}