package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/22
 * @Content:
 */
public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        UniquePathsWithObstacles obstacles = new UniquePathsWithObstacles();
        int paths = obstacles.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});
        System.out.println(paths);
    }
    public int uniquePathsWithObstacles(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] f = new int[m][n];
        for (int i = 0; i < m && grid[i][0] == 0; i++) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n && grid[0][j] == 0; j++) {
            f[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 1) continue;
                f[i][j] = f[i][j-1] + f[i-1][j];
            }
        }

        return f[m-1][n-1];
    }
}
