import java.util.*;



class Solution {
    // Function to return the sorted array.
    ArrayList<Integer> nearlySorted(int arr[], int num, int k) {
        // your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i <= k; i++) {
            pq.offer(arr[i]);
        }

        for (int i = 0; i < arr.length - k - 1; i++) {
            arr[i] = pq.remove();
            pq.offer(arr[i + k + 1]);
        }

        int i = arr.length - k - 1;
        while (pq.size() > 0) {
            arr[i] = pq.remove();
            i++;
        }

        // System.out.print(pq);

        ArrayList<Integer> list = new ArrayList<>();
        for (int e : arr) {
            list.add(e);
        }

        return list;
    }
}
