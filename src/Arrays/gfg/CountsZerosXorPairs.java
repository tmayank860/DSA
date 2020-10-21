package Arrays.gfg;

import java.util.Scanner;

public class CountsZerosXorPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] nums = new int[n];
                for (int i = 0; i < n; i++) {
                    nums[i]=sc.nextInt();
                }
                int count=0;
                for (int i=0;i<n;i++){
                    for (int j=i+1;j<n;j++){
                       int x=nums[i]^nums[j];
                       if (x==0){
                           count++;
                       }
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {

        }
    }
}
