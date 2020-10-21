package BinarySearch;

import java.util.HashMap;

import static BinarySearch.BinarySearchImplementation.bs;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={3,1,3,3,2};
        System.out.println(majorityElement(arr,5));

    }
    public static int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length;
        while (i < j) {
            int mid = (i+j)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
    static int majorityElement(int arr[], int n)
    {
        int limit=n/2;
        int i = 0;
        while (i < n)
        {

            if (arr[i] <= 0)
            {
                i++;
                continue;
            }

            int elementIndex = arr[i] - 1;

            if (arr[elementIndex] > 0)
            {
                arr[i] = arr[elementIndex];


                arr[elementIndex] = -1;
            }
            else
            {
                arr[elementIndex]--;

                arr[i] = 0;
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(Math.abs(arr[j])>limit){
                return arr[j]+1;
            }
        }
        return -1;
    }
}
