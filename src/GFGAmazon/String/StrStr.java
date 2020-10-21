package GFGAmazon.String;

public class StrStr {
    public static void main(String[] args) {
        System.out.println(strstr("GeeksForGeeks","Fr"));
    }
    static int strstr(String str, String target)
    {
        // Your code here
        if(str.contains(target)){
            return str.indexOf(target);
        }
        return -1;
    }
}
