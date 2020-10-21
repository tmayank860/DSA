package GFGAmazon.Sorting;

import java.util.Arrays;

public class TripletSumInArray {
    public static void main(String[] args) {
int arr[] = {1, 4 ,45 ,6 ,10, 8};
System.out.println(find3Numbers(arr,6,13));
    }

    public static int find3Numbers(int[] arr, int n, int x) {

        // Your code Here
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left=i+1;
            int right=n-1;
            int res=x-arr[i];
            while (left<right){
                if (res==arr[left]+arr[right]){
                    return 1;
                }else if(res>arr[left]+arr[right]){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return 0;
    }
}
