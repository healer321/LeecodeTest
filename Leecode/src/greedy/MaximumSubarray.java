package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray subarray = new MaximumSubarray();
        System.out.println(subarray.maxSubArray(nums));

    }
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];
        int[] dp = new int[len];
        int maxSum =0;
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
        }

        return maxSum;
    }
}
