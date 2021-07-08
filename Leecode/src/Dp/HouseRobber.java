package Dp;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/7
 * @Content:
 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = new int[]{1,3,1,3,100};
        HouseRobber robber = new HouseRobber();
        System.out.println(robber.houseRobber(houses));
        System.out.println(robber.houseRobberII(houses));
    }
    public int houseRobber(int[] houses){
        int len = houses.length;
        int[] dp = new int[len];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0],houses[1]);
        for (int j = 2; j < houses.length; j++) {
            dp[j] =  Math.max(dp[j-1],dp[j-2]+houses[j]);
        }

        return dp[len-1];
    }
    public int houseRobberII(int[] nums){
        int[] dp = new int[nums.length];
        int max= 0;
        if (nums.length<=3) {
            for (int i = 0; i < nums.length; i++) {
                if (max<nums[i]) max = nums[i];
            }
            return max;
        }

        for (int i = 2; i < nums.length-1; i++) {
            if (i==2) {
                dp[0] = nums[0];
                dp[1] = Math.max(nums[0],nums[1]);
            }
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }

        max = dp[nums.length-2];
        Arrays.fill(dp, 0);

        for (int i = 3; i <nums.length; i++) {
            if (i == 3) {
                dp[1] = nums[1];
                dp[2] = Math.max(nums[1],nums[2]);
            }
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        max = Math.max(max, dp[nums.length-1]);

        return max;
    }
}
