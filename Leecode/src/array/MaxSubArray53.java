package array;

public class MaxSubArray53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3};
        int i = maxSubArray(nums);
        System.out.println(i);
        String a ="b";
        StringBuffer b = new StringBuffer("b");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
    }
    public static int maxSubArray(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i- 1] + nums[i], nums[i]);
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
