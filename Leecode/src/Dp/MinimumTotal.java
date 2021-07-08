package Dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/22
 * @Content:
 */
public class MinimumTotal {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l4 = new ArrayList<>();
        l1.add(2);
        l2.add(3);
        l2.add(4);

        l3.add(6);
        l3.add(5);
        l3.add(7);

        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        MinimumTotal total = new MinimumTotal();
        System.out.println(list);
        System.out.println(total.minimumTotal(list));
    }
    public int minimumTotal(List<List<Integer>> tri) {
        int n = tri.size();
        int ans = Integer.MAX_VALUE;
        int[][] f = new int[n][n];
        f[0][0] = tri.get(0).get(0);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                int val = tri.get(i).get(j);
                f[i][j] = Integer.MAX_VALUE;
                if (j != 0) f[i][j] = Math.min(f[i][j], f[i - 1][j - 1] + val);
                if (j != i) f[i][j] = Math.min(f[i][j], f[i - 1][j] + val);
            }
        }
        for (int i = 0; i < n; i++) ans = Math.min(ans, f[n - 1][i]);
        return ans;
    }
}
