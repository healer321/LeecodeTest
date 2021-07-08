package binaryOperators;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/30
 * @Content:
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }
    public int singleNumber(int[] nums){
        int ret = 0;
        for (int num : nums) {
            ret = ret ^ num;
        }
        return ret;
    }
}
