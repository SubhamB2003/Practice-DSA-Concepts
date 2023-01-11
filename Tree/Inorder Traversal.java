import java.util.*;

/* A Binary Tree node*/

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();

        if (root != null) {
            ans.addAll(inOrder(root.left));
            ans.add(root.data);
            ans.addAll(inOrder(root.right));
        }

        return ans;
    }
}