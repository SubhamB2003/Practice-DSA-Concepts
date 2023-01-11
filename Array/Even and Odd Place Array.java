import java.util.*;

class Solution {
    static void reArrange(int[] arr, int n) {
        // code here
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    even.add(arr[i]);
                } else {
                    odd.add(arr[i]);
                }
            }
        }

        int j = 0, k = 0;
        if (even.size() == odd.size()) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = even.get(j++);
                } else {
                    arr[i] = odd.get(k++);
                }
            }
        }

    }
};