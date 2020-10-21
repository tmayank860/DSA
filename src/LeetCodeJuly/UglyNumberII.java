package LeetCodeJuly;

public class UglyNumberII {
    public static void main(String[] args) {
System.out.println(nthUglyNumber(10));
    }
    public static int nthUglyNumber(int n) {
        int[] ugly=new int[n];
        int i2=0,i3=0,i5=0;
        int multiple_of_two=2;
        int multiple_of_three=3;
        int multiple_of_five=5;
        int ugly_no=1;
        ugly[0]=1;
        for (int i=1;i<n;i++){
            ugly_no=Math.min(multiple_of_two,Math.min(multiple_of_three,multiple_of_five));
            ugly[i]=ugly_no;
            if (ugly_no==multiple_of_two){
                i2++;
                multiple_of_two=ugly[i2]*2;
            }
            if (ugly_no==multiple_of_three){
                i3++;
                multiple_of_three=ugly[i3]*3;
            } if (ugly_no==multiple_of_five){
                i5++;
                multiple_of_five=ugly[i5]*5;
            }
        }
return ugly_no;
    }
}
