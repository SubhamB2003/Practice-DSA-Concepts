import java.util.*;

class Solution {
    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

        for (int i = 0; i < n; i += k) {
            int j = Math.min(i + k - 1, n - 1);
            int l = i;

            while (l < j) {
                swap(arr, l, j);
                l++;
                j--;
            }
        }
    }

    void swap(ArrayList<Integer> arr, int x, int y) {
        int temp = arr.get(x);
        arr.set(x, arr.get(y));
        arr.set(y, temp);
    }
}
