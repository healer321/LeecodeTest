package binaryOperators;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/30
 * @Content:
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3,0,1,5,2};
        MissingNumber number = new MissingNumber();
        System.out.println(number.missingNumber(nums));
    }
    public int missingNumber(int[] nums){
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ i ^ nums[i];
        }

        return ret ^ nums.length ;
    }
}
