package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/21
 * @Content:
 */
public class FindNumberOfLIS {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,4,7};
        FindNumberOfLIS lis = new FindNumberOfLIS();
        System.out.println(lis.findNumberOfLIS(nums));

    }
    public int findNumberOfLIS(int[] nums){
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        return dp[0];
    }
}
