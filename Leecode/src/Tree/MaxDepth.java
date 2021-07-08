package Tree;

public class MaxDepth {

    private int count;
    private int max;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
//        TreeNode treeNode6 = new TreeNode(13);
//        TreeNode treeNode7 = new TreeNode(12);

        treeNode.right = treeNode3;
        treeNode.left = treeNode2;
        treeNode3.right=treeNode5;
        treeNode3.left = treeNode4;
//        treeNode2.right = treeNode6;
//        treeNode2.left = treeNode7;
        MaxDepth depth = new MaxDepth();
        int maxDepth = depth.maxDepth(treeNode);
        System.out.println(maxDepth);
    }

    public int maxDepth(TreeNode root){


        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
    }
}
