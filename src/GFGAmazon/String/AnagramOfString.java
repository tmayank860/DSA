package GFGAmazon.String;

import java.util.Arrays;

public class AnagramOfString {
    public static void main(String[] args) {

    }

    public int remAnagrams(String s, String s1) {
        //add code here.
        int [] st1=new int[26];
        Arrays.fill(st1,0);
        int [] st2=new int[26];
        Arrays.fill(st2,0);
        for (int i=0;i<s.length();i++){
            st1[s.charAt(i)-'a']++;
        }
        for (int i=0;i<s1.length();i++){
            st2[s1.charAt(i)-'a']++;
        }
        int result=0;
        for (int i=0;i<26;i++){
            result+=Math.abs(st1[i]-st2[i]);
        }
        return result;
    }
}
