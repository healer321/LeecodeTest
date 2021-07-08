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
public class LevelTraversalII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> inverTreeLevel(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if (root == null){return list;}

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<List<Integer>> listQueue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int treeNum = queue.size();
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < treeNum; i++) {
                TreeNode node = queue.poll();
                integerList.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }

            }
            listQueue.add(integerList);

        }
        while (!listQueue.isEmpty()){
            list.add(listQueue.poll());
        }
        return list;
    }
}
