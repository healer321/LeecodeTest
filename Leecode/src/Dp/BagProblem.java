package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/5
 * @Content:
 */
public class BagProblem {
    public static void main(String[] args) {
        int[] weight = new int[]{1,3,4};
        int[] value = new int[]{15,20,30};
        int bagWeight = 4;
        BagProblem bagProblem = new BagProblem();
        System.out.println(bagProblem.bagProblem(weight, value, bagWeight));

        System.out.println(bagProblem.PriorBagProblem(weight, value, bagWeight));
    }
    public int bagProblem(int[] weight,int[] value,int bagWeight){
        int[][] dp = new int[weight.length][bagWeight+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = bagWeight;j>=weight[0];j--){
            dp[0][j] = dp[0][j-weight[0]] + value[0];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0;j<=bagWeight;j++){
                if (j-weight[i]>=0) dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
            }
        }

        return dp[weight.length-1][bagWeight];
    }

    public int PriorBagProblem(int[] weight,int[] value,int bagWeight){
        int[] dp = new int[bagWeight+1];

        dp[0] = 0;
        for (int i= 0;i<weight.length;i++){
            for (int j = bagWeight;j>=weight[i];j--){
                dp[j] = Math.max(dp[j-weight[i]]+value[i], dp[j]);
            }
        }

        return dp[bagWeight];
    }
}
