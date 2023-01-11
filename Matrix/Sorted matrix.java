import java.util.*;

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int ans[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                list.add(Mat[i][j]);
            }
        }

        Collections.sort(list);

        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ans[i][j] = list.get(k++);
            }
        }

        return ans;
    }
};