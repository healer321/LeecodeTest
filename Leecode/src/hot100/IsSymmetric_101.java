package hot100;

public class IsSymmetric_101 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node3.right = node5;

        boolean b = isSymmetric(node1);
        System.out.println(b);

    }
    public static boolean isSymmetric(TreeNode root) {
        //如果根节点为空，则返回false
        if (root == null){
            return false;
        }
        return dfs(root.left, root.right);
    }
    public static boolean dfs(TreeNode left, TreeNode right){
        //递归的终止条件是两个节点为空
        //或者两个节点中一个为空
        //或者两个节点的值不相等
         if (left==null && right==null){
             return true;
         }
         if (left == null || right ==null){
             return false;
         }
         if (left.val != right.val){
             return false;
         }
         return dfs(left.left, right.right) && dfs(left.right, right.left);
        }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
