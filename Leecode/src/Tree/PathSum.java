package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathSum {

    private List<List<Integer>> list = new ArrayList<>();

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

        PathSum sum = new PathSum();
        List<List<Integer>> listList = sum.levelOrder(treeNode,25);
        listList.forEach(System.out::println);
    }


    public List<List<Integer>> levelOrder(TreeNode root, int target){
        //边界判断
        if (root == null){
            return list;
        }
        //创建队列
        Queue<TreeNode> queue = new LinkedList();
        //将头结点加入队列
        root.val = target - root.val;
        queue.add(root);
        //如果队列不为空就继续循环
        while (!queue.isEmpty()){
            //BFS打印，levelNum表示的是每层节点的数量
            int leveNum = queue.size();
            //IntegerList存储的是每层的节点的数量
            List<Integer> integerList = new ArrayList<>();
            for (int i=0;i<leveNum; i++){
                //出队
                TreeNode node = queue.poll();
                //将出队的节点的值加入到integerList
                integerList.add(node.val);
                if (node.val==0){
                    boolean flag = true;
                }
                //左右子节点不为空就加入到队列中
                if (node.left!=null){
                    node.left.val = node.val - node.left.val;
                    queue.add(node.left);
                }
                if (node.right!=null){
                    node.right.val = node.val - node.right.val;
                    queue.add(node.right);
                }
            }
            //将每层节点的值存储在list中
            list.add(integerList);
        }

        return list;
    }
}
