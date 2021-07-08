package Dp;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/6
 * @Content:
 */
public class PerfectSum {
    public static void main(String[] args) {
        PerfectSum sum = new PerfectSum();
        System.out.println(sum.squareSum(14));
    }
    public int squareSum(int n){
        String s = "";
        for (int i = 1; i <= n; i++) {
            int z = (int) Math.sqrt(i);
            if (z == Math.sqrt(i)) s += i;
        }
        String nus = "";
        char[] chars = s.toCharArray();
        int[] nums = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            nums[i] = Integer.parseInt(chars[i] + nus);
        }
        int[] dp = new int[n+1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {//物品
            for (int j = nums[i]; j <=n; j++) {//背包
                dp[j] = Math.min(dp[j],dp[j-nums[i]]+1);
            }
        }


        return dp[n];

    }
}
