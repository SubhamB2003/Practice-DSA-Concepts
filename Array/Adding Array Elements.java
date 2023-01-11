import java.util.*;

class Solution {
    int minOperations(int[] arr, int n, int k) {
        // code here
        int ans = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        while (pq.peek() < k) {
            int a = pq.peek();
            pq.poll();

            int b = pq.peek();
            pq.poll();

            int c = a + b;
            pq.add(c);
            ans++;

        }

        return ans;
    }
}
