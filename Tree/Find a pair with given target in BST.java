import java.util.*;

class Solution {
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target) {
        // Write your code here
        Set<Integer> set = new HashSet<>();

        boolean ans = matchPair(root, target, set);

        return ans ? 1 : 0;
    }

    public boolean matchPair(Node root, int target, Set<Integer> set) {

        if (root == null)
            return false;

        if (matchPair(root.left, target, set))
            return true;

        if (set.contains(target - root.data))
            return true;

        set.add(root.data);

        return matchPair(root.right, target, set);
    }

}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}