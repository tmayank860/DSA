package GFGInterviewPrep.Recursion;

public class StringPalindrom {
    public static void main(String[] args) {
        System.out.println(palindrom("geeks",0,4));

    }
    static boolean palindrom(String  str,int s,int e){
        if (s>=e){
            return true;
        }

        if (str.charAt(s)!=str.charAt(e)){
            return false;

        }
        return  palindrom(str,s+1,e-1);
    }
}
