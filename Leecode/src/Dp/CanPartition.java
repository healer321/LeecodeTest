package Dp;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/5
 * @Content:
 */
public class CanPartition {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,5};
        CanPartition partition = new CanPartition();
        System.out.println(partition.canPartition(nums));
    }
    public boolean canPartition(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 ==1) return false;
        int target = sum/2;
        Arrays.sort(nums);
        int[] dp = new int[target+1];
        for (int i=0;i<nums.length;i++){
            for (int j = target; j>=nums[i];j--){
                dp[j] = Math.max(dp[j-nums[i]]+nums[i], dp[j]);
            }
        }

        if (dp[target]==target){return true;}
        else return false;
    }
}
