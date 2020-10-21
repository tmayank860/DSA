package Arrays.gfg;

import java.util.Scanner;

public class RotatinganArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] nums = new int[n];
                for (int i=0;i<n;i++){
                    nums[i]=sc.nextInt();
                }
                int d=sc.nextInt();
                int[] arr=new int[n];
                for (int i=0;i<n;i++){
                    arr[((n+i-d)%n)]=nums[i];
                }
                for (int x:arr
                     ) {
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {

        }
    }
}
