import java.util.*;

//  Expected Time Complexity: O(logN)
//  Expected Auxiliary Spae: O(1).

class GFG {
    
    ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        HashMap<Integer, Long> ans = new HashMap<>();
        ArrayList<Long> al = new ArrayList<>();
        ArrayList<Long> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                ans.put(i, arr[i]);          // Store index as an Key
            }
        }

        if (ans.size() >= 1) {
            for (java.util.Map.Entry<Integer, Long> map : ans.entrySet()) {
                al.add((long) map.getKey());  // Add all the key in arrayList
            }

            Collections.sort(al);             // Sort the index values

            res.add(al.get(0));         // Store the first value
            res.add(al.get(al.size() - 1));    // Store the last value
            // System.out.println(ans);

            ans.clear();
            al.clear();

        } else {                             // If the search value is not present then add -1
            res.add((long) -1);
            res.add((long) -1);
        }

        return res;

    }
}
