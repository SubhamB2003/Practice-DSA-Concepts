
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        int rotations = d % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - rotations - 1);
        reverse(arr, n - rotations, n - 1);

    }

    static void reverse(int arr[], int l, int r) {

        while (l < r) {
            arr[l] = arr[l] ^ arr[r];
            arr[r] = arr[l] ^ arr[r];
            arr[l] = arr[l] ^ arr[r];
            l++;
            r--;
        }
    }
}