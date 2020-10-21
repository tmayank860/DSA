package Arrays.gfg;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                int max_sum=Integer.MIN_VALUE,current_sum=0;
                for (int i=0;i<n;i++){
                    current_sum+=arr[i];
                    max_sum=Integer.max(current_sum,max_sum);
                    if (current_sum<0){
                        current_sum=0;
                    }
                }
                System.out.println(max_sum);
            }
        } catch (Exception e) {

        }

    }
}
