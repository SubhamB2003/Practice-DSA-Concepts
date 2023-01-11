import java.util.*;

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(ar1[i]);
        }

        int j = 0;
        for (int i = n; i < n + n; i++) {
            al.add(ar2[j++]);
        }

        Collections.sort(al);

        // System.out.println(al);
        // System.out.print(al.get(n-1)+ " " + al.get(n));
        int ans = al.get(n - 1) + al.get(n);

        return ans;
    }
}