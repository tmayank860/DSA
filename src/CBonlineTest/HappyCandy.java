package CBonlineTest;

import java.util.Arrays;
import java.util.Scanner;

public class HappyCandy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i=n-1;i>n-k-1;i--){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
