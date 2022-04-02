package Strings;

public class RemoveString {
    public static void main (String[] args) {
//        String in="Mayaank";
//        String res="";
//        int k=2;
//        int i=1,n=in.length();
//        char current=in.charAt(0);
//        while(i<n){
//            String str="";
//            str+=current;
//            while(in.charAt(i)==current){
//                str+=in.charAt(i)+"";
//                i++;
//            }
//            if(str.length()!=k){
//                res+=str;
//            }
//            current=in.charAt(i);
//            i++;
//        }

        System.out.println(beautifulDays(20,23,6));
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int res = 0;

        // iterate the sequence
        for(int r = i; r<=j; r++){
            int rev = 0,diff=0,r_rcpy;
            // reverse the number
            r_rcpy = r;
            while(r_rcpy!=0){
                rev = (rev*10) ;
                rev=rev + (r_rcpy%10);
                r_rcpy=r_rcpy/10;
            }

            // calculate difference
            diff=Math.abs((r-rev)/k);
            if(diff*k==Math.abs(r-rev)){
                res++;
            }
        }
        return res;
    }

}

