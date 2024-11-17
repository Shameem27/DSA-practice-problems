import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (c == '(') {
                st.push(')');
            } else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses sol = new ValidParentheses ();
        System.out.println(sol.isValid("()"));
        System.out.println(sol.isValid("()[]{}"));
        System.out.println(sol.isValid("(]"));
        System.out.println(sol.isValid("([)]"));
        System.out.println(sol.isValid("{[]}"));
    }
}
