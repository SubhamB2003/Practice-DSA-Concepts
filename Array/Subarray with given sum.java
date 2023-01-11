import java.util.*;

class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0, c = 0, index = 0;

        for (int i = index; i < n; i++) {
            sum += arr[i];

            if (sum == s) {
                al.add(index + 1);
                al.add(i + 1);
                c++;
                break;
            }

            if (sum > s) {
                i = index++;
                sum = 0;
            }
        }

        if (c != 0) {
            return al;
        } else {
            al.add(-1);
            return al;
        }
    }
}