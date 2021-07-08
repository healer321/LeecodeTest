package greedy;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class SellStockII {
    public static void main(String[] args) {
        int[] stock = new int[]{7,1,5,3,6,4};
        SellStockII stockII = new SellStockII();
        System.out.println(stockII.maxProfit(stock));
    }

    public int maxProfit(int[] prices){
        int maxProfit = 0;
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]>prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}
