package greedy;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "ahbgdc";
        IsSubsequence subsequence = new IsSubsequence();
        System.out.println(subsequence.isSubsequence(s, t));
    }
    public boolean isSubsequence(String s, String t){
        int index = -1;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            index = t.indexOf(aChar);
            if (index == -1){
                return false;
            }
        }
        return true;
    }
}
