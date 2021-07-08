package Dp;

import java.util.*;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/21
 * @Content:
 */
public class ChangeCoins {
    public static void main(String[] args) {
        ChangeCoins coins = new ChangeCoins();
        int change = coins.change(100, new int[]{99,1});
        System.out.println(change);
    }
    public int change(int amount, int[] coins){
        int len = coins.length;
        Arrays.sort(coins);
        Deque<Integer> path = new ArrayDeque<>(len);
        List<List<Integer>> res = new ArrayList<>();
        dfs(coins,amount,0,path,res);

        System.out.println(res);
        System.out.println(res.size());
        return res.size();
    }

    private void dfs(int[] coins, int amount,int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (amount==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int j = begin; j < coins.length; j++) {
            if (amount-coins[j]<0){
                break;
            }
            if (j>begin && coins[j]==coins[j-1]) continue;
            path.add(coins[j]);

            dfs(coins, amount-coins[j],j, path, res);

            path.removeLast();
        }
    }
}
