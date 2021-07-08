package Dp;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/21
 * @Content:
 */
public class ChangeCoins_1 {
    public static void main(String[] args) {
        int[] coins = new int[]{99,1};
        ChangeCoins_1 coins_1 = new ChangeCoins_1();
        System.out.println(coins_1.change(100, coins));
    }
    public int change(int amount, int[] coins){
        int len =coins.length;
        if (len == 0) {
            if (amount==0) return 1;
            return 0;
        }
        int[][] dp = new int[len][amount+1];
        dp[0][0] = 1;
        for (int i = coins[0]; i <= amount; i += coins[0]) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j <=amount; j++) {
                for (int k = 0; j-k * coins[i] >= 0; k++) {
                    dp[i][j] += dp[i-1][j-k * coins[i]];
                }
            }
        }


        return dp[len-1][amount];
    }
}
