package GFGInterviewPrep.String;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s="mayank";
        System.out.println(s.replace('a','k'));
System.out.println(firstUniqChar("cca"));
    }
    public static int firstUniqChar(String s) {
    for (int i=0;i<s.length();i++){
        String cmp=s.substring(0,i)+s.substring(i+1,s.length());
        if (!cmp.contains(s.charAt(i)+"")){
            return i;
        }
    }
    return -1;
    }
}
