package RandomProblems;

import java.util.Scanner;

public class ChefandPriceControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int t=sc.nextInt();
            while (t-->=0){
                int n=sc.nextInt();
                int k=sc.nextInt();
                int total=0,reduced_price=0;
                int [] arr=new int[n];
                for (int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                for (int i=0;i<n;i++){
                    total+=arr[i];
                    if (arr[i]>k){
                        reduced_price+=arr[i]-k;
                    }
                }
                System.out.println(reduced_price);
            }
        }catch (Exception ignored){

        }
    }
}
