package Dp;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/21
 * @Content:
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babab";
        LongestPalindrome palindrome = new LongestPalindrome();
        String s1 = palindrome.longestPalindrome(s);
        System.out.println(s1);
    }
    public String longestPalindrome(String s){
        int len = s.length();
        if (len<2){
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        //dp[i][j] 表示s[i...j]是否是回文字符串
        boolean[][] dp = new boolean[len][len];
        //初始化：所有长度为1的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();

        //递推开始
        //先枚举子串长度
        for (int L = 2; L <= len ; L++) {
            //先枚举左边界，左边界的上限设置可以宽松
            for (int i = 0; i < len; i++) {
                //由L 和 i可以确定右边界，即j-i+L得
                int j = L+i-1;
                //如果右边界越界，就可以退出当前循环
                if (j >= len){
                    break;
                }

                if (charArray[i] != charArray[j]){
                    dp[i][j] = false;
                }else {
                    if (j - i < 3) dp[i][j] = true;
                    else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                //只要dp[i][j]==true成立，就表示子串s[i..j]是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }

        return s.substring(begin,begin+maxLen);
    }
}
