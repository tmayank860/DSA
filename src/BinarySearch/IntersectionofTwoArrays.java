package BinarySearch;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.print(intersection(nums1, nums2));

    }
    public static String intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int j=0;
        int[] result=new int[n1+n2];
        if (n1<n2){
            for (int i=0;i<n1;i++){
                hs.add(nums1[i]);
            }
            for (int i=0;i<n2;i++){
                if (hs.contains(nums2[i])){
                    result[j++]=nums2[i];
                    hs.remove(nums2[i]);
                }
            }
        }else {
            for (int i=0;i<n2;i++){
                hs.add(nums2[i]);
            }
            for (int i=0;i<n1;i++){
                if (hs.contains(nums1[i])){
                    result[j++]=nums1[i];
                    hs.remove(nums1[i]);
                }
            }
        }
        return Arrays.toString(Arrays.copyOfRange(result,0,j));
    }
}
