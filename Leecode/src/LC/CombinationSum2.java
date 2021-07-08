package LC;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] cand = {10,1,2,7,6,1,5};
        CombinationSum2 sum2 = new CombinationSum2();
        List<List<Integer>> lists = sum2.combinationSum2(cand, 8);
        System.out.println(lists);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int length = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (length==0) return res;
        Arrays.sort(candidates);

        Deque<Integer> path = new ArrayDeque<>();
        int begin = 0;
        dfs(candidates,length,path,res,target,begin);

        return res;

    }

    private void dfs(int[] candidates, int length, Deque<Integer> path, List<List<Integer>> res,int target,int begin) {
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=begin;i<length;i++){
            if (target-candidates[i]<0){
                break;
            }
            if (i>begin && candidates[i]==candidates[i-1]){
                continue;
            }

            path.addLast(candidates[i]);
            dfs(candidates, length, path, res, target-candidates[i],i+1);

            path.removeLast();


        }
    }
}
