package LC;

import java.util.*;

public class Solution_1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3};
        Solution_1 solution = new Solution_1();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
    public List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (length==0){
            return res;
        }

        //用栈实现回溯
        Deque<Integer> path = new ArrayDeque<>(length);
        boolean[] used = new boolean[length];
        Arrays.sort(nums);
        dfs(nums,length,0,path,res,used);

        return res;
    }

    private void dfs(int[] nums, int length, int depth, Deque<Integer> path, List<List<Integer>> res,boolean[] used) {
        if (depth==length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i<length;i++){
            if (used[i]){
                continue;
            }
            if (i>0 && nums[i]==nums[i-1] && !used[i - 1]){continue;}
            path.addLast(nums[i]);
            used[i] = true;

            dfs(nums, length, depth+1, path, res, used);

            //进行回溯
            path.removeLast();
            used[i] = false;
        }
    }

}
