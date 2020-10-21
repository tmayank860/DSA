package Arrays.gfg;

import java.util.Scanner;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t =sc.nextInt();
            while (t-- > 0) {
                int n =sc.nextInt();
                int[] arr =new int[n];
                for (int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                reArrange(arr,0,n-1);

                for (int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {

        }
    }
    static void reArrange(int[]arr,int s,int e){
        if (s>arr.length-1){
            return;
        }
        int temp=arr[e];
        for(int j = arr.length-1; j > s; j--){
            arr[j] = arr[j-1];
        }
        arr[s]=temp;
        reArrange(arr,s+2,arr.length-1);
    }
}
