package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.print(intersect(nums1, nums2));

    }

    public static String intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int n=nums1.length;
       int m=nums2.length;
       int[] result=new int[n+m];
       int i=0,j=0,k=0;
       while (i<n&&j<m){
           if (nums1[i]<nums2[j]){
               i++;
           }else if(nums1[i]>nums2[j]){
               j++;
           }else {
               result[k++]=nums1[i];
               i++;
               j++;
           }
       }
       return Arrays.toString(Arrays.copyOfRange(result,0,k));

    }
}
