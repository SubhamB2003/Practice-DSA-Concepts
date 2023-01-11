class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        if ((root == null) || (root.right == null && root.left == null))
            return true;

        boolean temp = false;

        if (root.data == isFindSum(root.left) + isFindSum(root.right)) {
            temp = true;
        }

        return temp && isSumTree(root.left) && isSumTree(root.right);
    }

    int isFindSum(Node root) {

        if (root == null)
            return 0;

        int a = isFindSum(root.left);
        int b = isFindSum(root.right);
        int c = root.data;

        return a + b + c;

    }
}