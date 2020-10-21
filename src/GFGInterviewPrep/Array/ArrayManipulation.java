package GFGInterviewPrep.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n+2];
        Arrays.fill(arr, 0);
        long max=0;
        while (m-- > 0) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        arr[a]+=k;
        arr[b+1]-=k;
        }
        for (int i=1;i<=n;i++){
            arr[i]+=arr[i-1];
           max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
