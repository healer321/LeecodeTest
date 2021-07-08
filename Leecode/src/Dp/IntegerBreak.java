package Dp;

import java.util.Map;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/5
 * @Content:
 */
public class IntegerBreak {
    public static void main(String[] args) {
        IntegerBreak aBreak = new IntegerBreak();
        System.out.println(aBreak.integerBreak(10));
    }
    public int integerBreak(int n){
        int[] dp = new int[n+1];
        //确定DP数组的含义：dp【i】分拆数字i，可以得到的最大成绩为dp【i】
        //dp[i]的最大乘积是怎么得到的？
        //1.j * (i - j) 直接相乘
        //2.j * dp[i - j]，相当于是拆分(i - j)，对这个拆分不理解的话，可以回想dp数组的定义
        dp[2] = 1;
        for (int i=3;i<=n;i++){
            for (int j = 1;j<i-1;j++){
                dp[i] = Math.max(dp[i],Math.max((i-j)*j, dp[i-j]*j));
            }
        }

        return dp[n];
    }
}
