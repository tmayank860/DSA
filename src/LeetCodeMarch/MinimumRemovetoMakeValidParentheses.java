package LeetCodeMarch;

import java.io.BufferedReader;
import java.util.Arrays;

public class MinimumRemovetoMakeValidParentheses {
    public static void main(String[] args) {
        String s="lee(t(c)o)((de)(";
        System.out.println(remove(s));

    }
    public String minRemoveToMakeValid(String s) {
        int braces=0;
        StringBuilder str=new StringBuilder();
        for (char c:s.toCharArray()
             ) {
            if (c=='('){
                braces++;
        }else if (c==')'){
                if (braces==0)continue;
                braces--;
            }
            str.append(c);
    }
        StringBuilder result=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='('&&braces-->0){
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.reverse().toString();
}

//))((
    public static String remove(String s){
        StringBuilder str=new StringBuilder("");
        int left=0;
        int []arr=new int[s.length()];
        Arrays.fill(arr,0);
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='('){
                arr[i]++;
                left++;
            }else if (s.charAt(i)==')'){
                if (left==0)continue;
                arr[i]--;
                left--;
            }
        }
        for (int i=0;i<s.length();i++ ){
            if (s.charAt(i)!=')'&&arr[i]==0  && left==0){
                str.append(s.charAt(i));
            }else if (arr[i]>0 && left==0){
                str.append('(');
            }else if (arr[i]<0 && left==0){
                str.append(')');
            }
        }
        return str.toString()==null? "":str.toString();
    }
}
