package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/6
 * @Content:
 */
public class TargetSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        TargetSum targetSum = new TargetSum();
        System.out.println(targetSum.targetSum(nums, 3));
    }
    public int targetSum(int[] nums,int target){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int left = (sum + target)/2;
        int[] dp = new int[left+1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = left; j >=nums[i]; j--) {
                dp[j] = dp[j] + dp[j-nums[i]];
            }
        }

        return dp[left];

    }
}
