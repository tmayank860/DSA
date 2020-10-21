package GFGAmazon.Sorting;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
int[] arr={8,-65,5,60,93,-21};
System.out.println(findTriplets(arr,6));
    }
    public static boolean findTriplets(int[] arr, int n)
    {
        //add code here.
        Arrays.sort(arr);
        // -65 -21 5 8 60 93
       for (int i=0;i<n-2;i++){
           int left=i+1;
           int right=n-1;
           int res= -arr[i];
           while (left<right){
               if (res==arr[left]+arr[right]){
                   return true;
               }else if (res>arr[left]+arr[right]){
                   left++;
               }else {
                   right--;
               }
           }
       }
        return false;
    }
}
