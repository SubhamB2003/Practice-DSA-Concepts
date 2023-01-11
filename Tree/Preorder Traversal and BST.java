import java.util.*;

class Solution {
    static int canRepresentBST(int arr[], int N) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int data = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] < data)
                return 0;

            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                data = stack.pop();
            }
            stack.push(arr[i]);
        }

        return 1;
    }
}