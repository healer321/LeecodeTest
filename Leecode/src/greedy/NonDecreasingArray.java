package greedy;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,2,3};
        NonDecreasingArray array = new NonDecreasingArray();
        System.out.println(array.checkPossibility(nums));

    }
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length && cnt < 2; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            cnt++;
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return cnt <= 1;
    }

}
