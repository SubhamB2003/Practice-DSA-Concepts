class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                temp = arr[i + 1];
            } else {
                break;
            }
        }

        return temp;
    }
}