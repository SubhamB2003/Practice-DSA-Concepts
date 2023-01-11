import java.util.*;

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    c++;
                }
            }

            list.add(c);
        }

        int ans = -1, max = Collections.max(list);

        for (int i = 0; i < list.size(); i++) {
            if (max != 0 && max == list.get(i)) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}