package GFGAmazon;

public class BinaryString {
    public static void main(String[] args) {
        System.out.println(binarySubstring(4,"1111"));
    }
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count=0;
//        for (int i=0;i<a;i++){
//            for (int j=i+1;j<a;j++){
//                String s=str.substring(i,j+1);
//                if (s.charAt(0)=='1'&&s.charAt(s.length()-1)=='1'){
//                    count++;
//                }
//            }
//        }
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='1'){
                count++;
            }
        }
        return (count*(count-1))/2;

    }
}
