package GFG;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {

    }
    public static String reverse(String S){
        //code here
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<S.length();i++){
            stack.push(S.charAt(i));
        }
        String res="";
        while (!stack.empty()){
            res+=stack.peek();
            stack.pop();
        }
        return res.replaceAll(" ","");
    }
}
