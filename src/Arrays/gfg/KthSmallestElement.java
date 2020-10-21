package Arrays.gfg;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        try {
//            int t=sc.nextInt();
//            while(t-->0)
            {
                int n=6;
//                sc.nextInt();
                int k=3;
//                sc.nextInt();
                int[] nums={7 ,10, 4 ,3, 20, 15};
//                new int[n];
//                for (int i=0;i<n;i++){
//                    nums[i]=sc.nextInt();
//                }
                quickSort(nums,0,n-1);

for (int x:nums){
    System.out.println(x);
}
                System.out.println(nums[k-1]);
            }
//        } catch (Exception e) {
//
//        }

    }

    public static void quickSort(int[] nums,int start,int end){
        if (start<end) {
            int pivot = partition(nums, start, end);
            quickSort(nums, start, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int piviot=nums[end];
        int i=start-1;
//        int j=end;
        for (int j=start; j<end; j++) {
            if (nums[j]<piviot){
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[end];
        nums[end] = temp;

        return i+1;
    }
}
