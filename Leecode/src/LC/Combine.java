package LC;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        Combine lc = new Combine();
        System.out.println(lc.combine(4, 2));

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n==0 || k==0) return res;
        Deque<Integer> path =new ArrayDeque<>(k);

        dfs(n,0,res,path,k,1);

        return res;
    }

    private static void dfs(int n, int depth, List<List<Integer>> res, Deque<Integer> path,int k,int begin) {
        if (depth==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=begin;i<=n; i++){
            //当搜索的深度等于要求的深度时跳出循环
            if (depth==k) break;
            path.add(i);
            System.out.println("path==>"+path);

            dfs(n, depth+1, res, path, k,i+1);

            path.removeLast();

        }
    }
}
