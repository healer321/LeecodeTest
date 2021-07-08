package hot100;

public class MaxDepth {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }
}
