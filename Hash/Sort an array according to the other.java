import java.util.*;

class Solution {
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]

    // Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        // Your code here
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        Arrays.sort(A1);

        int temp[] = A1.clone();

        for (int i = 0; i < A1.length; i++) {
            map1.put(A1[i], map1.getOrDefault(A1[i], 0) + 1);
        }

        for (int i = 0; i < A2.length; i++) {
            map2.put(A2[i], map2.getOrDefault(A2[i], 0) + 1);
        }

        int k = 0;

        for (int i = 0; i < A2.length; i++) {
            if (map1.containsKey(A2[i])) {
                for (int j = 0; j < map1.get(A2[i]); j++) {
                    A1[k++] = A2[i];
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (!map2.containsKey(temp[i]) && map1.containsKey(temp[i])) {
                A1[k++] = temp[i];
            }
        }

        return A1;
    }
}