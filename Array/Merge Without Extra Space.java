import java.util.*;

class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            newArr.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            newArr.add(arr2[i]);
        }

        Collections.sort(newArr);
        // System.out.print(newArr);

        for (int i = 0; i < n; i++) {
            arr1[i] = newArr.get(i);
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = newArr.get(n + i);
        }

    }
}