class Solution {
    public static long[] productExceptSelf(int arr[], int n) {
        // code here
        long newArr[] = new long[n];
        long ans = 1;

        int x = 0;
        for (int i = 0; i < n; i++) {
            int j = 0, k = i + 1;

            while (i != 0 && j < i) {
                ans *= arr[j++];
            }

            while (k < n) {
                ans *= arr[k++];
            }

            newArr[x++] = ans;
            ans = 1;
        }

        return newArr;
    }
}