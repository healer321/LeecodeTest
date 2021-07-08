package LC;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        CombinationSum sum = new CombinationSum();
        List<List<Integer>> combinationSum = sum.combinationSum(nums, target);
        combinationSum.forEach(System.out::println);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int length = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (length==0) return res;
        //排序是剪枝的前提
        Arrays.sort(candidates);

        Deque<Integer> path = new ArrayDeque<>();

        dfs(candidates,0,length,target,path,res);


        return res;
    }

    private void dfs(int[] candidates, int begin, int length, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target==0){
            res.add(new ArrayList<>(path));
            return;
        }

        //begin开始搜索的含义
        for (int i=begin ; i<length; i++){
            if (target-candidates[i]<0){
                break;
            }

            path.addLast(candidates[i]);

            System.out.println("递归之前 => " + path +"， begin==>"+begin+ "，剩余 = " + (target - candidates[i]));
            //由于每个元素可以重复使用，下一轮的搜索起点依然是i，这里非常容易弄错
            dfs(candidates, i, length, target-candidates[i],path,res);

            //状态重置
            path.removeLast();
            System.out.println("递归之后 => " + path+"，begin==>"+begin);
        }
    }

}
