import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTree {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();

        if (root != null) {
            ans.add(root.data);
            ans.addAll(preorder(root.left));
            ans.addAll(preorder(root.right));
        }

        return ans;
    }

}