class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int a = 0, b = 0;

        // Duplicate Element
        for (int i = 0; i < n; i++) {
            int temp = Math.abs(arr[i]);

            if (arr[temp - 1] > 0) {
                arr[temp - 1] = -arr[temp - 1];
            } else {
                a = temp;
            }
        }

        // Missing Element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                b = i + 1;
                break;
            }
        }

        return new int[] { a, b };
    }
}

// Time Complexcity : O(N)
// Space Complexcity : O(1)