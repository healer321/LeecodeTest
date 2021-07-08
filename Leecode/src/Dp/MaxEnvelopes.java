package Dp;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/21
 * @Content:
 */
public class MaxEnvelopes {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{4,5},{4,6},{6,7},{2,3},{1,1}};
        MaxEnvelopes envelopes = new MaxEnvelopes();
        System.out.println(envelopes.maxEnvelopes(nums));
    }
    public int maxEnvelopes(int[][] envelopes){
        int max = 1;
        int[] dp = new int[envelopes.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < envelopes.length; i++) {
            for (int j = i; j < envelopes.length; j++) {
                if (envelopes[i][0]>envelopes[j][0]){
                    if (envelopes[i][1]>envelopes[j][1]){
                        dp[i] = Math.max(dp[i],dp[j]+1);
                    }
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i],max);
            System.out.println(dp[i]);
        }


        return max;
    }
}
