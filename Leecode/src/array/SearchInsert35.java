package array;

import java.util.HashMap;
import java.util.Map;

public class SearchInsert35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int insert = searchInsert(nums, 0);
        System.out.println(insert);
    }

    public static int searchInsert(int[] nums, int target){
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                index = i;
                flag =true;
            }
        }

        if (flag){
            return index;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]<target){
                    index = i+1;
                }
            }
            if (index==0){
                return index;
            }else {
            return index;
            }
        }
    }
}
