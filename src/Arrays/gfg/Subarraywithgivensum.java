package Arrays.gfg;

import java.util.Arrays;
import java.util.Scanner;

public class Subarraywithgivensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int target = sc.nextInt();
                int[] nums = new int[n];
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }
                int current_sum = 0, start = 0, flag = 0;
                for (int i = 0; i < n; i++) {
                    current_sum += nums[i];
                    while (current_sum > target) {
                        current_sum = current_sum - nums[start];
                        start++;
                    }
                    if (current_sum == target) {
                        flag = 1;
                        System.out.println((start + 1) + " " + (i + 1));
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(-1);
                }

            }

        } catch (Exception e) {

        }

    }

    static void subArrayWithGivenSum(int[] arr, int target, int n) {
        int start = 0, sum = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            while (sum > target) {
                sum = sum - arr[start++];
            }
            if (sum == target) {
                System.out.println(start + 1 + " " + (i + 1));
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }
    }

}
