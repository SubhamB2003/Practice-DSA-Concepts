import java.util.*;

class Solution {
    public static int kthSmallest(int[][] mat, int n, int k) {
        // code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pq.offer(mat[i][j]);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}