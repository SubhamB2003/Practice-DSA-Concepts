import java.util.*;

class Solution {

    public long minValue(long a[], long b[], long n) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);

        long result = 0;

        for (int i = 0; i < (int) n; i++) {
            result += a[i] * b[(int) n - 1 - i];
        }

        return result;
    }
}