import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();

        PrintLeftView(root, 0, list);

        return list;
    }

    void PrintLeftView(Node root, int level, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(root.data);
        }

        PrintLeftView(root.left, level + 1, list);
        PrintLeftView(root.right, level + 1, list);

    }
}