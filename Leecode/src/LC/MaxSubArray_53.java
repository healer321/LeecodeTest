package LC;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/20
 * @Content:
 */
public class MaxSubArray_53 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1};
        MaxSubArray_53 array = new MaxSubArray_53();
        System.out.println(array.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int max = 0;
        int[] dp =new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i]+Math.max(dp[i-1],0);
        }
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max,dp[i]);
            System.out.println(dp[i]);
        }
        return max;
    }
}
