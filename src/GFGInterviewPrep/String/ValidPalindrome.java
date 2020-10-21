package GFGInterviewPrep.String;

public class ValidPalindrome {
    public static void main(String[] args) {
System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str=str.toLowerCase();
        return isPalindromer(str,0,str.length()-1);
    }
    public static boolean isPalindromer(String str,int start,int end) {
        if (start>end){
            return true;
        }
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
        return isPalindromer(str,start+1,end-1);
    }

}
