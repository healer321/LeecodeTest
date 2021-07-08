package greedy;

import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class SellStock {
    public static void main(String[] args) {
        int[] stock = new int[]{7,1,5,3,6,4};
        SellStock sellStock = new SellStock();
        int maxProfit = sellStock.maxProfit(stock);
        System.out.println(maxProfit);
    }
    public int maxProfit(int[] prices){
        if (prices.length == 0) return 0;
        int stockMin = prices[0];
        int stockMax = 0;
        for (int i = 1; i < prices.length; i++) {
            if (stockMin > prices[i]){
                stockMin = prices[i];
            }else {
                stockMax = Math.max(stockMax, prices[i] - stockMin);
            }
        }

        return stockMax;
    }
}
