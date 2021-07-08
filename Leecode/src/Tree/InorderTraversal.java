package Tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root){

        if (root.left!=null){
            inorderTraversal(root.left);
        }
        if (root == null) {
            return list;
        }

        list.add(root.val);

        if (root.right!=null){
            inorderTraversal(root.right);
        }

        return list;
    }
}
