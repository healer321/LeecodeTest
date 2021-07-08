package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/5
 * @Content:
 */
public class NumTress {
    public static void main(String[] args) {
        NumTress tress = new NumTress();
        System.out.println(tress.numTrees(5));
    }
    public int numTrees(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                dp[i] = dp[i] + dp[j-1]*dp[i-j];
            }
        }

        return dp[n];

    }
}
