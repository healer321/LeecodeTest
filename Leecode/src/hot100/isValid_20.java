package hot100;

import java.util.Stack;

public class isValid_20 {
    public static void main(String[] args) {
        String s = "]";
        boolean b = isValid(s);
        System.out.println(b);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ']' && !stack.isEmpty() && stack.peek() == '[' ) stack.pop();
            else if (chars[i] == ')' && !stack.isEmpty() && stack.peek() == '(' ) stack.pop();
            else if ( chars[i] == '}' && !stack.isEmpty() && stack.peek() == '{' ) stack.pop();
            else stack.push(chars[i]);
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
