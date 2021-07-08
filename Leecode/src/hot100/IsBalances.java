package hot100;

public class IsBalances {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node2.left = node5;
        node5.left = node6;
        node5.right = node7;

        boolean b = isBalanced(node1);
        System.out.println(b);
    }
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int recur = height(root.left)-height(root.right);
        return recur < 2 ? true : false && isBalanced(root.left) && isBalanced(root.right);
    }
    public static int height(TreeNode root){
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }
}
