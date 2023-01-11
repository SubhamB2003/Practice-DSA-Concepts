import java.util.*;

class Solution {
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here

        int sum[] = new int[R];
        int max_Sum = Integer.MIN_VALUE;

        for (int cStart = 0; cStart < C; cStart++) {
            Arrays.fill(sum, 0);
            for (int cEnd = cStart; cEnd < C; cEnd++) {
                for (int row = 0; row < R; row++) {
                    sum[row] += M[row][cEnd];
                }

                int currMaxSum = Kadans(sum);
                max_Sum = Math.max(max_Sum, currMaxSum);
            }
        }

        return max_Sum;
    }

    int Kadans(int a[]) {
        int n = a.length, curSum = 0, sum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            curSum += a[i];

            if (curSum > sum) {
                sum = curSum;
            }

            if (curSum < 0) {
                curSum = 0;
            }
        }

        return sum;
    }

};