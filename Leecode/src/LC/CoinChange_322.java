package LC;

import java.util.*;

public class CoinChange_322 {
    public static int number = 0;

    public static void main(String[] args) {
        //6249
//        int[] coins = {186,419,83,408};
        int[] coins = new int[]{3,5,7,8,9,10,11};
        CoinChange_322 change322 = new CoinChange_322();
        int i = change322.coinChange(500,coins);
        System.out.println(i);

    }
    public int coinChange(int amount,int[] coins){
        int len = coins.length;
        if (len == 0) return 0;

        Deque<Integer> number = new ArrayDeque<>();

        Arrays.sort(coins);
        dfs(coins,amount,len-1,number);

        return number.size();

    }

    private void dfs(int[] coins, int amount,int begin,Deque<Integer> nus) {
        if (amount == 0) {
            nus.add(1);
            return;
        }
        for (int i = begin; i >= 0; i--) {
//            int k = amount /coins[i];
            if (amount<0) break;
            System.out.println(amount);
            dfs(coins, amount-coins[i],i,nus);
        }
    }


}
