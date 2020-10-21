package GFGAmazon;

public class Replaceall0swith5 {
    public static void main(String[] args) {
        convertFive(6650);
    }
    public static void convertFive(int n){
//add code here.
        String s=Integer.toString(n);
      String s1= s.replace('0','5');
       System.out.println(s1);
        }

}
