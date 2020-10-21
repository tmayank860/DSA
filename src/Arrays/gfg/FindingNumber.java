package Arrays.gfg;

import java.util.Scanner;

public class FindingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        try {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int x=sc.nextInt();
            System.out.println(number(nums,n,x));
        }
    }

    public static int number(int[] nums, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
