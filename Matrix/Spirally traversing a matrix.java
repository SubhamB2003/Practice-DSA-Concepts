import java.util.*;

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        int dir = 0, left = 0, right = c - 1, top = 0, bottom = r - 1;

        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }

                top++;
            }

            else if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
            }

            else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

            dir = (dir + 1) % 4;
        }

        return list;
    }
}