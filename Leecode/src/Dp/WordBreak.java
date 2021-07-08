package Dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/7/6
 * @Content:
 */
public class WordBreak {
    public static void main(String[] args) {
        String s = "catsandog";
        List<String> list = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(s.substring(2,3));
        WordBreak aBreak = new WordBreak();
        System.out.println(aBreak.wordBreak(s, list));
    }
    public boolean wordBreak(String s, List<String> wordDict){
        boolean[] dp = new boolean[s.length()+1];
        Set<String> wordSet = new HashSet<>();
        for (String s1 : wordDict) {
            wordSet.add(s1);
        }

        //
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {//背包的容量：字符串的长度
            for (int j = 0; j <i; j++) {//遍历物品：物品的数量
                String word = s.substring(j,i);
                if (wordSet.contains(word) && dp[j]){
                    dp[i] = true;
                }

            }
        }

        return dp[s.length()];
    }
}
