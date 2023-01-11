import java.util.*;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public pair[] allPairs(long A[], long B[], long N, long M, long X) {
        // Your code goes here

        HashSet<Long> set = new HashSet<>();
        ArrayList<pair> list = new ArrayList<>();

        Arrays.sort(A);
        for (int i = 0; i < M; i++) {
            set.add(B[i]);
        }

        for (int i = 0; i < N; i++) {
            if (set.contains(X - A[i])) {
                list.add(new pair(A[i], X - A[i]));
            }
        }

        pair[] arr = new pair[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}