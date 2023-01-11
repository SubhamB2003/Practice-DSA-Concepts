import java.util.*;

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int need_platforms = 1, ans = 1, i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                need_platforms++;
                i++;
            } else if (arr[i] > dep[j]) {
                need_platforms--;
                j++;
            }

            ans = Math.max(need_platforms, ans);
        }

        return ans;
        
        /*
         * Arrays.sort(arr);
         * Arrays.sort(dep);
         * 
         * int need_platforms = 1, ans = 1, j = 0;
         * 
         * for(int i = 1; i < n; i++) {
         * if(arr[i] > dep[j]) {
         * j++;
         * } else {
         * need_platforms++;
         * if(need_platforms > ans) {
         * ans = need_platforms;
         * }
         * }
         * }
         * 
         * return ans;
         */
    }

}
