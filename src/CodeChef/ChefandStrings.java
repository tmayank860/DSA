package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChefandStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        try {
            int t=sc.nextInt();
            while (t-->0){
                int n=sc.nextInt();
//                String s=br.readLine();
//                String[] str=s.split(" ");
                int[] string=new int[n];
                for (int i=0;i<n;i++){
                    string[i]=sc.nextInt();
                }
                long sum=0;
                for (int i=0;i<n-1;i++){
                    sum+=Math.abs(string[i+1]-string[i])-1;
                }
                System.out.println(sum);
            }

        }catch (Exception e){

        }

    }
}
