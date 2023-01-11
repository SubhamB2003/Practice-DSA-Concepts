class Solution {
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    void zigZag(int arr[], int n) {
        // code here
        for(int i = 1; i < n; i += 2) {
            if(arr[i-1] > arr[i]) {
                swap(arr, i-1, i);
            }
            
            if(i+1 < n && arr[i] < arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
    }
}