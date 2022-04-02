package Strings;

public class Space20 {
    public static void main(String[] args) {
        System.out.println(space("hello world, how are you?"));
    }
    static String space(String s){
        String[] arr=s.split(" ");
        int i=0;
        String result="";
        while (i<arr.length-1){
            result+=arr[i]+"%20";
            i++;
        }
        return result+arr[i];
    }
}
