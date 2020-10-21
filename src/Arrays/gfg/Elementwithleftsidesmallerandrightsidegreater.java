package Arrays.gfg;

import java.util.Scanner;

public class Elementwithleftsidesmallerandrightsidegreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int[] left_max =new int[n];
            left_max[0]=Integer.MIN_VALUE;
            for (int i=1;i<n;i++){
                left_max[i]=Math.max(left_max[i-1],nums[i-1]);
            }
            int[] right_min =new int[n];
            right_min[n-1]=Integer.MAX_VALUE;
            for (int i=n-2;i>=0;i--){
                right_min[i]=Math.min(right_min[i+1],nums[i+1]);
            }

            int flag=0,indx=0;

            for (int i=1;i<n-1;i++){
                if(left_max[i]<nums[i]&&right_min[i]>nums[i]){
                    flag=1;
                    indx=i;
                    break;
                }
            }
            if (flag==1){
                System.out.println(nums[indx]);
            }else {
                System.out.println(-1);
            }
        }
    }
}
