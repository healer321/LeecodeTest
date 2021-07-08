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
public class NTreeLevelOrder {

    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int treeNum = queue.size();
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < treeNum; i++) {
                Node node = queue.poll();
                integerList.add(node.val);
                List<Node> children = node.children;
                int j = 0;
                while (j<children.size()){
                    queue.add(children.get(j));
                    j++;
                }
            }
            list.add(integerList);

        }

        return list;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
