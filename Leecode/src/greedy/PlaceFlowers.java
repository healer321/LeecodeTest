package greedy;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/29
 * @Content:
 */
public class PlaceFlowers {
    public static void main(String[] args) {
        PlaceFlowers flowers = new PlaceFlowers();
        int[] flowereds = new int[]{1,0,0,0,0};

        boolean b = flowers.canPlaceFlowers(flowereds, 2);
        System.out.println(b);
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        int len = flowerbed.length;
        int cnt = 0;
        for (int i = 0; i < len && cnt < n; i++) {
            if (flowerbed[i] == 1){
                continue;
            }
            int pre = i == 0 ? 0 : flowerbed[i-1];
            int next = i == len -1 ? 0 : flowerbed[i+1];

            if (pre == 0 && next ==0 ){
                cnt++;
                flowerbed[i] = 1;
            }
        }
        return cnt >=n;

    }
}
