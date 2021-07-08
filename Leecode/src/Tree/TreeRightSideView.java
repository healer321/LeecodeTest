package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/7
 * @Content:
 */
public class TreeRightSideView {
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int treeNum = queue.size();
            for (int i = 0; i < treeNum; i++) {
                TreeNode node = queue.poll();
                if (i==treeNum-1){
                    list.add(node.val);
                }
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }

        }
        return list;


    }
}
