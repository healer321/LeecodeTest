package LC;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/20
 * @Content:
 */
public class Solution_300 {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        Solution_300 solution = new Solution_300();
        solution.lengthOfLIS(nums);

    }
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];

        // 1 初始化
        for(int i=0;i<len;i++){
            dp[i]=1;
        }
        // 2 填表
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }

        // 3 遍历dp表，找到最大值
        //因为dp[i]的含义是以第i个元素结尾的最大的递增子序列，所以dp[len-1]不一定最大！
        int max=0;
        for(int i=0;i<len;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
