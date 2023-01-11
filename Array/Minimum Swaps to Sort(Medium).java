import java.util.*;

class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[]) {
        // Code here
        int arr[] = nums.clone();

        Arrays.sort(nums);
        int n = nums.length, i = 0, swap = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] == nums[i]) {
                i++;
            } else {
                int k;
                for (k = j + 1; k < n; k++) {
                    if (arr[k] == nums[i])
                        break;
                }

                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
                swap++;
            }
        }

        return swap;
    }
}