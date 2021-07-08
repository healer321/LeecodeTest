package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] ints = {{1, 2}, {1, 2}, {1, 2}};
        NonOverlappingIntervals intervals = new NonOverlappingIntervals();
        System.out.println(intervals.eraseOverlapIntervals(ints));
    }
    public int eraseOverlapIntervals(int[][] intervals){
        if (intervals.length==0) return 0;
        Arrays.sort(intervals,Comparator.comparingInt(o->o[1]));
        int cnt =1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length ; i++) {
            if (intervals[i][0] < end){
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }

        return intervals.length - cnt;

    }
}
