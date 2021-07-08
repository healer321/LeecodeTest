package LC;

import java.util.Arrays;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        String ch = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z' || chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= '0' && chars[i] <= '9'){
                ch += chars[i];
            }
        }

        String toLowerCase = ch.toLowerCase();
        System.out.println(toLowerCase);
        char[] charArray = toLowerCase.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        boolean flag = true;
        while (left <= right){
            if (charArray[left]==charArray[right]){
                left++;
                right--;
            }
            else {
                flag =false;
                break;
            }
        }
        if (flag == true){
            return true;
        }else {
            return false;
        }

    }
}
