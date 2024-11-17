class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree1 {

    Node root;

    int maxDepth(Node node) {
        if (node == null) return 0;

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(7);

        System.out.println("The height of the binary tree is: " + tree.maxDepth(tree.root));
    }
}
