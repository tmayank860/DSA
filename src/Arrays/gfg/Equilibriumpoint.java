package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Equilibriumpoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
            int n=Integer.parseInt(br.readLine());
            long[] nums = new long[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nums[i] = Long.parseLong(inputLine[i]);
            }

           System.out.println(equbiliriumPoint(nums,n));

        }
    }
    public static int equbiliriumPoint(long[] nums,int n){

        if (n==1){
            return 1;
        }
        long sum=0,left_sum=0;
        for (long x:nums){
            sum+=x;
        }
        for (int i=0;i<n;i++){
            sum-=nums[i];
            if (left_sum==sum){
                return (i+1);
            }
            left_sum+=nums[i];
        }
        return -1;
    }
}
