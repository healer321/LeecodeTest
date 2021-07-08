package binaryOperators;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/30
 * @Content:
 */
public class SingleNumberII {
    public static void main(String[] args) {
        int a= 1;
        int b =2;
        System.out.println(Integer.bitCount(17));


        int[] nums = new int[]{1,2,1,3,2,5};
        SingleNumberII numberII = new SingleNumberII();
        int[] singleNumber = numberII.singleNumber(nums);
        System.out.println(Arrays.toString(singleNumber));
    }
    public int[] singleNumber(int[] nums){
        int[] ret = new int[2];
        int diff = 0;
        for (int num : nums) {
            diff = diff ^ num;
        }
        diff = diff & (-diff);

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & diff) ==0) ret[0] ^= nums[i];
            else ret[1] ^= nums[i];
        }

        return ret;
    }
}
