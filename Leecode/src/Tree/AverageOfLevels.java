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
public class AverageOfLevels {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(13);
        TreeNode treeNode7 = new TreeNode(12);

        treeNode.right = treeNode3;
        treeNode.left = treeNode2;
        treeNode3.right=treeNode5;
        treeNode3.left = treeNode4;
        treeNode2.right = treeNode6;
        treeNode2.left = treeNode7;

        AverageOfLevels average = new AverageOfLevels();
        List<Double> doubles = average.averageOfLevels(treeNode);
        doubles.forEach(System.out::println);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> doubleList = new ArrayList<>();
        if (root == null) return doubleList;
        //依赖队列进行辅助判断
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //判断队列是否为空
        while (!queue.isEmpty()){
            int treNum = queue.size();
            double sum = 0;
            for (int i = 0; i < treNum; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }

            }
            doubleList.add(sum/treNum);
        }

        return doubleList;
    }
}
