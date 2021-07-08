package hot100;

import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(prices[i]-minPrice,maxProfit);
            minPrice = Math.min(prices[i],minPrice);
        }
        return maxProfit;
    }
}
