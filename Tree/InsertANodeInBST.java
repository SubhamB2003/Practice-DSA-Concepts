class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if (root == null)
            return new Node(Key);

        if (root.data > Key) {
            root.left = insert(root.left, Key);
        } else if (root.data < Key) {
            root.right = insert(root.right, Key);
        }

        return root;
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}