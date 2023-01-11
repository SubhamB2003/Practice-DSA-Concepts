import java.util.*;

class Solution {

    // temp: input array
    // n: size of array
    // Function to rearrange the array elements alternately.
    public static void rearrange(long arr[], int n) {

        // Your code here
        ArrayList<Long> max = new ArrayList<>();
        ArrayList<Long> min = new ArrayList<>();

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                min.add(arr[i]);
            }
            for (int i = n / 2; i < n; i++) {
                max.add(arr[i]);
            }
            Collections.reverse(max);

            int j = 0, k = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = max.get(j++);
                } else {
                    arr[i] = min.get(k++);
                }
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                min.add(arr[i]);
            }
            Long temp = arr[n / 2];

            for (int i = (n / 2) + 1; i < n; i++) {
                max.add(arr[i]);
            }
            Collections.reverse(max);

            int j = 0, k = 0;
            for (int i = 0; i < n - 1; i++) {
                if (i % 2 == 0) {
                    arr[i] = max.get(j++);
                } else {
                    arr[i] = min.get(k++);
                }
            }

            arr[n - 1] = temp;
        }

    }

}
