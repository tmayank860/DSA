package BinarySearch;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8,9};
        System.out.println(bs(arr,0,7,4));
        System.out.println(searchInsert(arr,4));
    }
    public static int searchInsert(int[] nums, int target) {

        int indx= bs(nums,0,nums.length-1,target);
        if (indx==-1){
            if (nums[0]>target){
                return 0;
            }else if (nums[nums.length-1]<=target){
                return nums.length;
            }else {
                for (int i=0;i<nums.length-1;i++){
                    if (target>nums[i]&&target<nums[i+1]){
                        return i+1;
                    }
                }
            }
        }
        return indx;
    }
    public static int bs(int [] arr,int start,int end,int val){
        if (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == val) {
                return mid;
            }
            if (arr[mid] > val) {
                return bs(arr, start, mid - 1, val);
            }
            if (arr[mid] < val) {
                return bs(arr, mid +  1, end, val);
            }
        }
        return -1;
    }
}

