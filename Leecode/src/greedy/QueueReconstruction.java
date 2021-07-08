package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class QueueReconstruction {
    public static void main(String[] args) {
        int[][] people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        QueueReconstruction reconstruction = new QueueReconstruction();
        reconstruction.reconstructQueue(people);
    }
    public int[][] reconstructQueue(int[][] people){
        if (people == null || people.length == 0 || people[0].length == 0){
            return new int[0][0];
        }
        Arrays.sort(people, (a,b) -> (a[0]==b[0] ? a[1]-b[1] : b[0] - a[0]));
        List<int[]> queue = new ArrayList<>();
        for (int[] person : people) {
//            System.out.println(Arrays.toString(person));
            queue.add(person[1],person);
        }
        int[][] array = queue.toArray(new int[queue.size()][]);
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        return new int[0][0];
    }
}
