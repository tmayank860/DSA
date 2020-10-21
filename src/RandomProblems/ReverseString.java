package RandomProblems;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] c={'h','a','n','n','a','h'};
        reverseString(c);
    }
    public static void reverseString(char[] s) {
       int i=0,j=s.length-1;
       while (i<j){
           swap(s,i++,j--);
       }
           System.out.print(Arrays.toString(s));
       
    }
    public static void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
