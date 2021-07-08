package greedy;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class AssignCookies {
    public static void main(String[] args) {
        int[] grid = new int[]{1,3};
        int[] size = new int[]{1,2,4};

        AssignCookies cookies = new AssignCookies();
        System.out.println(cookies.findContentChildren(grid, size));

    }
    public int findContentChildren(int[] grid, int[] size){
        if (grid == null || size == null) return 0;

        Arrays.sort(grid);
        Arrays.sort(size);

        int gi =0;
        int si = 0;
        while (gi<grid.length && si < size.length){
            if (grid[gi]<=size[si]){
                gi++;
            }
            si++;
        }


        return gi;
    }
}
