package hot100;

import java.util.Arrays;
import java.util.HashMap;

public class LengthOfstring_3 {
    public static void main(String[] args) {
        String s ="abcabcd";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);

    }
    public static int lengthOfLongestSubstring(String s){
        if (s.length()==0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max =0;
        int left = 0;
        for (int i = 0; i< s.length();i++){
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left +1);
        }
        return max;
    }
}
