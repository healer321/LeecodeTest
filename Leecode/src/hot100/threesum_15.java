package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class threesum_15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        lists.forEach(System.out::println);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> IntegerList = new ArrayList<>();
        if (nums.length < 3) return IntegerList;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) break;
            if (i>0 && nums[i] == nums[i-1]) continue;
            int L = i+1;
            int R = nums.length - 1;
            while (L<R){
                int sum = nums[i] + nums[L] + nums[R];
                if (sum==0){
                    List<Integer> list = Arrays.asList(nums[i], nums[L], nums[R]);
                    IntegerList.add(list);
                    while (L<R && nums[L] == nums[L+1]) L++;
                    while (L<R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }

        return IntegerList;
    }
}
