import java.util.*;

class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(arr1[i]);
        }

        int j = 0;
        for (int i = n; i < n + m; i++) {
            al.add(arr2[j]);
            j++;
        }

        Collections.sort(al);

        // System.out.print(al);

        int ans = al.get(k - 1);

        return ans;
    }
}