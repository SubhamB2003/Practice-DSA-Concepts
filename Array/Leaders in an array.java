import java.util.*;

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> newArr = new ArrayList<>();

        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (max <= arr[i]) {
                max = arr[i];
                newArr.add(arr[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < newArr.size(); i++) {
            ans.add(newArr.get(newArr.size() - i - 1));
        }

        return ans;
    }

}