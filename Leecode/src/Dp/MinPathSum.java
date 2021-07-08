package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/22
 * @Content:
 */
public class MinPathSum {
    public static void main(String[] args) {
        MinPathSum pathSum = new MinPathSum();
        int sum = pathSum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});
        System.out.println(sum);
    }
    public int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] f = new int[m][n];
        int[] g = new int[m*n];

        f[0][0] = grid[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i>0 && j>0){
                    f[i][j] = Math.min(f[i-1][j],f[i][j-1]) + grid[i][j];
                }else if (i>0){
                    f[i][j] = f[i-1][j] + grid[i][j];
                }else if (j>0){
                    f[i][j] = f[i][j-1] + grid[i][j];
                }
            }
        }



        return f[m-1][n-1];
    }
}
