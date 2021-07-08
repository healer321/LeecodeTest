package array;

import java.util.HashMap;
import java.util.Map;

//两数之和
public class Sum {
    public static void main(String[] args) {
       int[] nums = {3,3};
       int target = 6;
        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public static int[] twoSum(int[] nums, int target){
        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        //将数组放入到map集合中
        for (int i=0; i< nums.length;i++){
            map.put(nums[i], i);
        }
        //如果key值和数组的值有相等的，就取出来
        for (int i=0; i< nums.length; i++){
            if (map.containsKey(target-nums[i]) && map.get((target-nums[i]))!=i)
            {
                arr[0] = i ;
                arr[1] = map.get(target-nums[i]);
            }
        }
        return arr;
    }
}
