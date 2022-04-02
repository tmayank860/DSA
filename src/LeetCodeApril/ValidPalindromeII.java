package LeetCodeApril;
//DAY 2
public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("eeccccbebaeeabebccceea"));
    }
    public static boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                return isPalindrom(s,l+1,r)|| isPalindrom(s,l,r-1);
            }

        }
        return true;
    }
    static boolean isPalindrom(String s, int left, int right){
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;

            }else{
                return false;
            }
        }
        return true;
    }
}