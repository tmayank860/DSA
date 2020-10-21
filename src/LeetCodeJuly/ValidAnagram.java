package LeetCodeJuly;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
String s = "a", t = "b";
System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        int[] arr2 = new int[26];
        Arrays.fill(arr2,0);
        for (int i=0;i<s.length();i++){
            arr[122-s.charAt(i)]++;
        }
        for (int i=0;i<t.length();i++){
            arr2[122-t.charAt(i)]++;
        }
        for(int i=0;i<26;i++){
            if (arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
