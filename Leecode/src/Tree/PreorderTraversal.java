package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PreorderTraversal {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;

        PreorderTraversal traversal = new PreorderTraversal();

        List<Integer> list = traversal.preorderTraversal(treeNode);
        list.forEach(System.out::println);

    }

    public List<Integer> preorderTraversal(TreeNode root){
        if (root==null){
            return list;
        }
        list.add(root.val);

        if (root.left!=null){
            preorderTraversal(root.left);
        }
        if (root.right!=null){
            preorderTraversal(root.right);
        }

        return list;
    }
}

class TreeNode{
    int val ;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }
    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
