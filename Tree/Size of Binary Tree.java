class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Tree {
    public static int getSize(Node root) {
        // add Code here.
        if (root == null) {
            return 0;
        }

        return (getSize(root.left) + getSize(root.right)) + 1;
    }
}
