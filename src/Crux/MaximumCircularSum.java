package Crux;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int t=1;
//            sc.nextInt();
            while (t-->0){
                int n=7;
//                sc.nextInt();
                int[] arr={8, -8, 9 ,-9, 10, -11, 12};
//                        new int[n];
//                for (int i=0;i<n;i++){
//                    arr[i]=sc.nextInt();
//                }
                int sum=0;
                for (int i=0;i<n;i++){
                    sum=sum+arr[i];
                    arr[i]=-1*arr[i];
                }
                int max=maxSum(arr,n);
                int result=-1*(sum-(-1*max));
                System.out.println(result);
            }
        }catch (Exception e){

        }
    }
    static int maxSum(int [] arr,int n){
        int max_sum=Integer.MIN_VALUE,current_sum=0;
        for (int i=0;i<n;i++){
            current_sum+=arr[i];
            max_sum=Integer.max(current_sum,max_sum);
            if (current_sum<0){
                current_sum=0;
            }
        }
        return max_sum;
    }

}
