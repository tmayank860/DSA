package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromicString {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=1;
        while (n-->0){
            String s="hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh";
            System.out.println(palindromeIndex(s));
        }

    }
    static int palindromeIndex(String s) {
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                if(s.charAt(start)==s.charAt(end-1)&&s.charAt(start)!=s.charAt(end)){
                    return end;
                }else if(s.charAt(start+1)==s.charAt(end)){
                    return start;
                }
            }else{
                start++;
                end--;
            }
        }
        return -1;

    }
}
