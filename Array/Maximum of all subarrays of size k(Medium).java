import java.util.*;

class Solution {
    // Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        ans.add(pq.peek());

        for (int i = k; i < n; i++) {
            pq.remove(arr[i - k]);
            pq.add(arr[i]);

            ans.add(pq.peek());
        }

        // System.out.print(ans);

        return ans;
    }
}
