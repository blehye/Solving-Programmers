package level_2;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        String s = "(())()";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        if (s.charAt(0) == ')')
            return false;

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("1");
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
