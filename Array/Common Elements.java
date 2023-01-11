import java.util.*;

class Solution {
    public static ArrayList<Integer> common_element(ArrayList<Integer> v1, ArrayList<Integer> v2) {
        // Your code here
        ArrayList<Integer> ansList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < v1.size(); i++) {
            map.put(v1.get(i), map.getOrDefault(v1.get(i), 0) + 1);
        }

        for (int i = 0; i < v2.size(); i++) {
            if (map.containsKey(v2.get(i))) {
                ansList.add(v2.get(i));

                if (map.get(v2.get(i)) == 1) {
                    map.remove(v2.get(i));
                } else {
                    map.put(v2.get(i), map.get(v2.get(i)) - 1);
                }
            }
        }

        Collections.sort(ansList);

        return ansList;
    }
}
