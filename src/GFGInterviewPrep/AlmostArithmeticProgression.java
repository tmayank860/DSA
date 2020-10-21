package GFGInterviewPrep;

import java.util.Scanner;

public class AlmostArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),j=0,t=0,sol=0;;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        int[][]x=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(j=0;j<i;j++){
                x[i][j]=x[j][t]+1;
                if(arr[i]==arr[j])t=j;
                if(x[i][j]>sol){
                    sol=x[i][j];
                }
            }
        }
        System.out.println(sol);

    }
}
