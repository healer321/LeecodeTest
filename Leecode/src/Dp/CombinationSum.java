package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/6
 * @Content:
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        CombinationSum sum = new CombinationSum();
        System.out.println(sum.combinationSum(nums, 4));
        System.out.println(Math.sqrt(5));
        int z = (int) Math.sqrt(9);
        if (z==Math.sqrt(9)) System.out.println(true);
        else System.out.println(false);

    }
    public int combinationSum(int[] nums,int target){
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i=0;i<=target;i++){
            for (int j=0;j< nums.length;j++){
                if (i-nums[j]>=0) dp[i] += dp[i-nums[j]];
            }
        }
        return dp[target];
    }
}
