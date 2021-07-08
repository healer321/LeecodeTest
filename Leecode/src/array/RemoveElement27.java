package array;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};

        int element = removeElement(nums, 2);
        for (int i = 0; i < element; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val){
        int cur = 0;
        int next = 0;
        while (next<nums.length){
            if (nums[next]!=val){
                nums[cur] = nums[next];
                cur = cur +1;
            }
            next = next +1;
        }
        return cur;
    }
}
