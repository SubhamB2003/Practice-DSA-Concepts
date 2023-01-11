import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Tree {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();

        if (root != null) {
            ans.addAll(postOrder(root.left));
            ans.addAll(postOrder(root.right));
            ans.add(root.data);
        }

        return ans;
    }
}