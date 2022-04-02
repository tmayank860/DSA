package LeetCodeMarch;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

    }
    public static boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        int i=0,l=s.length();
        Stack<Character> st=new Stack();
        while(i<l){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else if (s.charAt(i)==')'&&!st.isEmpty()&&st.peek()=='('){
                st.pop();
            }else if (s.charAt(i)=='}'&&!st.isEmpty()&&st.peek()=='{'){
                st.pop();
            }else if (s.charAt(i)==']'&&!st.isEmpty()&&st.peek()=='['){
                st.pop();
            }else {
                return false;
            }
            i++;
        }
        return st.isEmpty();
    }

}
