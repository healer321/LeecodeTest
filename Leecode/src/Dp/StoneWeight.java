package Dp;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/5
 * @Content:
 */
public class StoneWeight {
    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,4,1,8,1};
        int[] nums = new int[]{1,1,1,1,1};
        StoneWeight weight = new StoneWeight();
        System.out.println(weight.stoneWeight(nums));
    }
    public int stoneWeight(int[] stones){
        int sum = 0;
        int len = stones.length;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int target = sum /2;
//        int target = 4;
        int[] dp = new int[target+1];
        for (int i = 0; i< len; i++){
            for (int j = target;j >= stones[i];j--){
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        int res = sum - dp[target];


        System.out.println(Arrays.toString(dp));


        return Math.abs(res - dp[target]);
    }
}
