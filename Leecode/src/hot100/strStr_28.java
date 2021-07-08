package hot100;

public class strStr_28 {
    public static void main(String[] args) {
        String pattern = "an";
        String target = "aanaaa";
        System.out.println(strStr(target, pattern));

    }

    public static int strStr(String haystack, String needle){
        if (needle.length()==0) return 0;
        char[] chars_pattern = needle.toCharArray();
        char[] chars_target = haystack.toCharArray();

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
//                System.out.println(tar - pos);
                return tar - pos;
            }
        }
        return -1;

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
