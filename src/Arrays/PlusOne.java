package Arrays;

import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
//        int [] arr={};
//        System.out.println(plusOne(arr));
        int n = 5;

        // Loop to print Circle
        // (Upper part of design)
        // Outer loop to
        // control height of
        // design
        for (int i = 0; i <= 2 * n; i++)
        {
            // Inner loop to control
            // width
            for (int j = 0; j <= 2 * n; j++) {

                // computing distance of
                // each point from center
                float center_dist =(float) Math.sqrt((i - n) *
                        (i - n) +    (j - n) * (j - n));

                if (center_dist > n - 0.5
                        && center_dist < n + 0.5)
                    System.out.print("$");
                else
                    System.out.print(" ");
            }

            // Printing HappY Women's DaY
            if (i == n)
                System.out.print(" "
                        + "HappY Women's DaY");
            System.out.println();
        }

        // Loop to print lower part
        // Outer loop to control
        // height
        for (int i = 0; i <= n; i++) {

            // Positioning pattern
            // Loop for Printing
            // horizontal line
            if (i == (n / 2) + 1) {
                for (int j = 0; j <= 2 * n; j++)
                    if (j >= (n - n / 2) && j <= (n + n / 2))
                        System.out.print("$");
                    else
                        System.out.print(" ");
            }
            else {

                for (int j = 0; j <= 2 * n; j++) {
                    if (j == n)
                        System.out.print("$");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

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

    public static int findEarliestMonth(List<Integer> stockPrice) {
        // Write your code here
        int min=Integer.MAX_VALUE;
        int start=0,end=stockPrice.size()-1;
        for(int i=0;i<end;i++){
            int left=0,right=0;
            for(int j=0;j<=i;j++){
                left+=stockPrice.get(j);
            }
            for(int j=i+1;j<=end;j++){
                left+=stockPrice.get(j);
            }
            min=Math.min(min,Math.abs(left/(i+1)-right/(end-i+1)));
        }
        return min;

    }

}
