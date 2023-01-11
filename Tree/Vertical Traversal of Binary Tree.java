import java.util.*;

class Solution {
    // Function to find the vertical order traversal of Binary Tree.
    static ArrayList<Integer> verticalOrder(Node root) {
        // add your code here
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));

        while (!q.isEmpty()) {
            Pair cur = q.poll();

            if (map.containsKey(cur.hd)) {
                map.get(cur.hd).add(cur.node.data);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(cur.node.data);
                map.put(cur.hd, temp);
            }

            if (cur.node.left != null) {
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }

            if (cur.node.right != null) {
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            ans.addAll(e.getValue());
        }

        return ans;
    }

    static class Pair {
        int hd;
        Node node;

        public Pair(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }

}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}