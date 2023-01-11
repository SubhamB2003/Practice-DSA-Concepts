import java.util.*;

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here

        int temp = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp = i + 1;
            if (arr[i] == temp) {
                al.add(arr[i]);
            }
            // System.out.print(arr[i] + " ");
        }

        return al;
    }
}
