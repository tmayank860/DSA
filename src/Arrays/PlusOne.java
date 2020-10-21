package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] arr={9};
        System.out.println(plusOne(arr));

    }
    public static String  plusOne(int[] digits) {
        int n=digits.length;
        if (digits[n-1]!=9&&n>1){
            digits[n-1]=digits[n-1]+1;
        }else if(n==1&&digits[0]==9){
            digits[0]=1;
            digits[1]=0;
        }else {
            digits[n-1]=0;
            digits[n-2]=digits[n-2]+1;
        }

        return Arrays.toString(digits);
    }
}
