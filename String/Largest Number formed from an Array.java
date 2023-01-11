import java.util.*;

// Expected Time Complexity: O(NlogN)
// Expected Auxiliary Space: O(1)

class Solution {
    String printLargest(String[] arr) {
        // code here

        StringBuilder ans = new StringBuilder();
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        for (int i = 0; i < arr.length; i++) {
            ans.append(arr[i]);
        }

        return ans.toString();

    }
}