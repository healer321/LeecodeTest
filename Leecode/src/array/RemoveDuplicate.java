package array;

//26题
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int i = removeDuplicates(nums);
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
        }
    }

    public static int removeDuplicates(int[] nums){
        int next = 1;
        int cur=0;
        while (next<nums.length){
            if (nums[cur]!=nums[next]){
                nums[cur+1] = nums[next];
                cur +=1;
            }
            next+=1;
        }

        return cur+1;

    }
}
