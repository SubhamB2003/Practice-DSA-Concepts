class Solution {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        // add code here.
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                ans = i + 1;
            }
        }

        return ans;
    }
}