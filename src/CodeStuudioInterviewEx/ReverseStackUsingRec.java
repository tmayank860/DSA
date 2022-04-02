package CodeStuudioInterviewEx;

import java.util.Stack;

public class ReverseStackUsingRec {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
     static void reverseStack(Stack<Integer> stack) {
        // write your code here
        if(!stack.isEmpty()){
            int x=stack.peek();
            stack.pop();
            reverseStack(stack);
            reverse( x, stack);
        }
    }

    static void reverse(int x,Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.add(x);
        }else{

            int a = stack.peek();
            stack.pop();
            reverse(x,stack);
            stack.push(a);
        }
    }
}
