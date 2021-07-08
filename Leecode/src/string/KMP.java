package string;

public class KMP {
    public static void main(String[] args) {
        String pattern = "annacanna";
        String target = "annabcdanacadsannannacanna";

        char[] chars_pattern = pattern.toCharArray();
        char[] chars_target = target.toCharArray();

        int[] nexts = next(chars_pattern);
        int length_target = chars_target.length;
        int tar =0;
        int pos = 0;
        while (tar < length_target){
            if (chars_target[tar] == chars_pattern[pos]){
                tar++;
                pos++;
            }else if (pos != 0){
                pos = nexts[pos-1];
            }else {
                tar++;
            }

            if (pos == chars_pattern.length){
                System.out.println(tar - pos + 1);
                pos = nexts[pos-1];
            }


        }

    }

    public static int[] next(char[] pattern){
        int[] next = new int[pattern.length];
        next[0]=0;
        int i= 1;
        int k = 0;
        int length = pattern.length;
        while (i<length){
            if (pattern[i] == pattern[k]){
                next[i] = k+1;
                i++;
                k++;
            }else if (k==0){
                next[i] = 0;
                i++;
            }
            else {
                k = next[k-1];
            }
        }
        return next;
    }
}
