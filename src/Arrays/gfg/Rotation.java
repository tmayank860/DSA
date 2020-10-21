package Arrays.gfg;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] nums=new int[n];
                for (int i=0;i<n;i++){
                    nums[i]=sc.nextInt();
                }
                int k=0;
                if (n<3){
                    for (int i=0;i<n-1;i++){
                        if (nums[i]<nums[i+1]){
                            break;
                        }else {
                            k++;
                        }
                    }
                }else {
                    for (int i = 0; i < n - 2; i++) {
                        if (nums[i] >nums[i + 1] && nums[i + 1] < nums[i + 2]) {
                            k++;
                            break;
                        } else {
                            k++;
                        }
                    }
                }
               System.out.println(k);
            }

        } catch (Exception e) {

        }

    }
}
