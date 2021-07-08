package WangYi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:hechen
 * @Date:2021/6/26
 * @Content:
 */
public class Directory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        if (scanner.hasNextLine()){
            s1 = scanner.nextLine();
            s2 = scanner.nextLine();
        }
        String[] s = s1.split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        String[] strings = s2.split(" ");
        int[] cha = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            cha[i] = Integer.parseInt(strings[i]);
        }
        scanner.close();
        System.out.println(Arrays.toString(cha));
        Directory directory = new Directory();
        int[] minDir = directory.minDir(cha, m, n);
        String minD = "";
        for (int i = 0; i < minDir.length; i++) {
            if (i!=minDir.length-1)
            minD =  minD + minDir[i] + " ";
            else {
                minD += minDir[i];
            }
        }
        System.out.println(minD);

    }
    public int[] minDir(int[] minChar, int m, int n){
        int[] arr = new int[m];
        int adInter = m-n;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < minChar.length; i++) {
            min = Math.min(min, minChar[i]);
            max = Math.max(max, minChar[i]);
        }
        if (min >= adInter+1) {
            for (int i = 0; i < adInter; i++) {
                arr[i] = i+1;
            }
            int j =0;
            for (int i = adInter; i < m; i++) {
                arr[i] = minChar[j];
                j++;
            }
        }else if (min<adInter+1 && min >1){

        }else {
            int k = 0;
            int ar = 0;
            for (int i = min; i <=max ; i++) {
                if (i==minChar[k]){
                    arr[ar] = minChar[k];
                    k++;
                    ar++;
                }else if (ar==m-1){
                    break;
                }else {
                    arr[ar] = i;
                }
            }
        }




        return arr;
    }
}
