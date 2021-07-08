package binaryOperators;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/30
 * @Content:
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance distance = new HammingDistance();
        System.out.println(distance.hammingDistance(1, 4));
    }
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while(z != 0) {
            if ((z & 1) == 1) cnt++;
            z = z >> 1;
        }
        System.out.println(Integer.bitCount(4));
        return cnt;
    }

}
