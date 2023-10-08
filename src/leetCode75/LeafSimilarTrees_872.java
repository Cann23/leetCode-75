package leetCode75;

import java.util.ArrayList;

public class LeafSimilarTrees_872 {
    public static void main(String[] args) {
        TreeNode _6 = new TreeNode(6);
        TreeNode _7 = new TreeNode(7);
        TreeNode _4 = new TreeNode(4);
        TreeNode _9 = new TreeNode(9);
        TreeNode _8 = new TreeNode(8);
        TreeNode _2 = new TreeNode(2, _7, _4);
        TreeNode _5 = new TreeNode(5, _6, _2);
        TreeNode _1 = new TreeNode(1, _9, _8);
        TreeNode root = new TreeNode(3, _5, _1);

        TreeNode _22 = new TreeNode(2, _9, _8);
        TreeNode _55 = new TreeNode(5, _6, _7);
        TreeNode _11 = new TreeNode(1, _4, _22);
        TreeNode root2 = new TreeNode(3, _55, _11);
        System.out.println(leafSimilar(root, root2));
    }

    private static ArrayList<Integer> leafValues = new ArrayList<>();

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList leafValues1 = new ArrayList<>();
        ArrayList leafValues2 = new ArrayList<>();

        leafList(root1, leafValues1);
        leafList(root2, leafValues2);

        if (leafValues1.size() == leafValues2.size()) {
            for (int i = 0; i < leafValues1.size(); i++) {
                if (leafValues1.get(i) != leafValues2.get(i)) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }


    }

    private static void leafList(TreeNode root, ArrayList<Integer> leafValues) {
        if (root == null) {
            return;
        } else if (root.left == null && root.right == null) {
            leafValues.add(root.val);
        }

        leafList(root.left, leafValues);
        leafList(root.right, leafValues);
    }
}
