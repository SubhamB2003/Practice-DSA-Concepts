class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTree {
    static int sumBT(Node head) {
        // Code
        if (head == null) {
            return 0;
        }

        return (sumBT(head.left) + sumBT(head.right) + head.data);
    }
}