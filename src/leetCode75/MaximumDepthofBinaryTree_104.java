package leetCode75;

public class MaximumDepthofBinaryTree_104 {
    public static void main(String[] args) {
        TreeNode _9 = new TreeNode(9);
        TreeNode _15 = new TreeNode(15);
        TreeNode _7 = new TreeNode(7);
        TreeNode _20 = new TreeNode(20, _15, _7);
        TreeNode root = new TreeNode(3, _9, _20);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftNode = maxDepth(root.left) + 1;
        int rightNode = maxDepth(root.right) + 1;

        return Math.max(leftNode, rightNode);

    }

}
