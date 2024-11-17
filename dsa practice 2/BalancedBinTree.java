class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){ this.val=val; }
}
public class BalancedBinTree {
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int height(TreeNode node) {
        if (node== null){
            return 0;
        }
        return 1 + Math.max(height(node.left),height(node.right));
    }

    public static void main(String[] args) {
        BalancedBinTree tree = new BalancedBinTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(tree.isBalanced(root));
    }
}
