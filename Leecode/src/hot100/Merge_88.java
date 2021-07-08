package hot100;

import java.util.Arrays;

public class Merge_88 {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};

        Merge_88 merge88 = new Merge_88();
        merge88.merge(nums1,1,nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[1];
        if (n==0) merge = nums1;
        if (n==1 && m>0) {
            nums1[m-1] = nums2[0];
            merge = nums1;
            Arrays.sort(merge);
        }
        else if (n==1 && m==0) merge[0] = nums2[0];
        else {
        int right = 0;
        int i = 0;
        int k =0;
        while (i<nums1.length){
            if (right == n) break;
            if (nums1[i]<=nums2[right] && i<m){
                merge[k] = nums1[i];
                k++;
                i++;
            }else {
                merge[k] = nums2[right];
                k++;
                right++;
            }
            }
        for (int i1 = 0; i1 < merge.length; i1++) {
            nums1[i1] = merge[i1];
        }
        }
    }
}
