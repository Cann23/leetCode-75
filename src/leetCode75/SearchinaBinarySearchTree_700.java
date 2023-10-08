package leetCode75;

public class SearchinaBinarySearchTree_700 {
    public static void main(String[] args) {
//        TreeNode _7 = new TreeNode(7);
//        TreeNode _1 = new TreeNode(1);
//        TreeNode _3 = new TreeNode(3);
//        TreeNode _2 = new TreeNode(2, _1, _3);
//        TreeNode root = new TreeNode(4, _2, _7);

        TreeNode _2 = new TreeNode(2);
        TreeNode _84 = new TreeNode(84);
        TreeNode _63 = new TreeNode(63, null, _84);
        TreeNode _22 = new TreeNode(22, null, _63);
        TreeNode root = new TreeNode(18, _2, _22);

        System.out.println(searchBST(root, 63));
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        } else {
            return root.val < val ? searchBST(root.right, val)
                    : (root.val > val ? searchBST(root.left, val)
                    : root);
        }
    }
}
