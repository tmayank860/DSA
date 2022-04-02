package LeetCodeMarch;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));

    }
    public static int[] countBits(int n) {
        int [] arr=new int[n+1];
        String [] str=new String[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int j=2;j<=n;j++){
            int sum=0,i=j;
            String s="";
            while (i>0){
                s+=i%2;
                sum+=i%2;
                i=i/2;
            }
            str[j]=s+"=>"+sum;
            arr[j]=sum;
        }
        System.out.println(Arrays.toString(str));
        return arr;
    }
}
