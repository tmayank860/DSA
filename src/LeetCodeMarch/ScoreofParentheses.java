package LeetCodeMarch;

import java.util.Stack;

public class ScoreofParentheses {
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(()(()()))"));
    }
    public static int scoreOfParentheses(String s) {
        if(s.equals("()")){
            return 1;
        }
        Stack<Character> st=new Stack();
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                st.push(ch);
            }
            else {
                // if top of stack is '('
                if(!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                    st.push('1');
                } else {
                    // if top of stack is a '(char) number'
                    int sum = 0;
                    while(!st.isEmpty() && st.peek()!='(') {
                        sum += st.pop()-'0';
                    }
                    // pop '('
                    st.pop();
                    st.push((char)(2*sum+'0'));
                }
            }
        }

        int sum = 0;
        while(!st.isEmpty()) {
            sum += (st.pop()-'0');
        }
        return sum;
    }
}
