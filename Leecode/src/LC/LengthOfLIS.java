package LC;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/21
 * @Content:
 */
public class LengthOfLIS {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        LengthOfLIS lis = new LengthOfLIS();
        System.out.println(lis.lengthOfLIS(nums));

    }
    public int lengthOfLIS(int[] nums){
        int max =1;
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
            if (dp[i]>max){
                max = Math.max(dp[i],max);

            }
        }

        return max;
    }
}
