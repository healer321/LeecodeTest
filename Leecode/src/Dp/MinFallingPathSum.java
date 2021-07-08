package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/23
 * @Content:
 */
public class MinFallingPathSum {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{2,1,3},{6,5,4},{7,8,9}};
        MinFallingPathSum sum = new MinFallingPathSum();
        int pathSum = sum.minFallingPathSum(nums);
        System.out.println(pathSum);
    }
    public int minFallingPathSum(int[][] mat){
        int len = mat.length;
        int[][] f = new int[len][len];
        for (int i = 0; i < len; i++) {
            f[0][i] = mat[0][i];
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                f[i][j] = f[i-1][j] + mat[i][j];
                if (j-1 >= 0){
                    f[i][j] = Math.min(f[i][j],f[i-1][j-1]+mat[i][j]);
                }
                if (j+1 < len) {
                    f[i][j] = Math.min(f[i][j],f[i-1][j+1]+mat[i][j]);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < f.length; i++) {
            ans = Math.min(f[len-1][i],ans);
        }

        return ans;
    }
}
