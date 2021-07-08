package LC;

import java.util.Arrays;

public class searchMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(Arrays.toString(nums[0]));
        System.out.println(search(nums, 20));
    }
    public static boolean search(int[][] matrix, int target){
        boolean flag = false;
        for (int i = 0; i < matrix.length; i++) {
            boolean b = binary(matrix[i], target, 0, matrix[i].length-1);
            if (b==true){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean binary(int[] nums, int target, int left,int right){
        int mid = (left + right)/2;
        if (target > nums[mid] && left < right) {
            left = left +1;
            return binary(nums, target, left,right);
        } else if (target < nums[mid] && left < right) {
            right = right-1;
            return binary(nums, target, left,right);
        } else if (target == nums[mid] || target == nums[left] || target == nums[right]) {
            return true;
        }

        return false;
    }
}
