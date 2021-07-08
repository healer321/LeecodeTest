package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/23
 * @Content:
 */
public class ChangCoins_2 {
    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        ChangCoins_2 coins_2 = new ChangCoins_2();
        System.out.println(coins_2.change(5, coins));
    }
    public int change(int amount, int[] coins){
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
            }
        }

        return dp[amount];
    }
}
