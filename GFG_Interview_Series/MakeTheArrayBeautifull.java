import java.util.*;

class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int e : arr) {
            if (st.isEmpty()) {
                st.push(e);
            } else if (st.peek() >= 0 && e >= 0) {
                st.push(e);
            } else if (st.peek() < 0 && e < 0) {
                st.push(e);
            } else {
                st.pop();
            }
        }

        for (int i : st) {
            list.add(i);
        }

        return list;
    }
}
