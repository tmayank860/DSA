package GFGAmazon.Searching;

public class SearchinaSortedandRotatedArray {
    public static void main(String[] args) {

    }
    static int Search(int[] array, int target)
    {
        // code here
        int pivot=pivot(array,0,array.length-1);
        if (pivot==-1){
            return bs(array,0,array.length-1,target);
        }
        if (array[pivot]==target){
            return pivot;
        }
        if (array[0]<=target){
            return bs(array,0,pivot-1,target);
        }
        return bs(array,pivot+1,array.length-1,target);

    }

    public static int pivot(int[]arr,int start,int end){
        if (end<start){
            return -1;
        }
        if (start==end){
            return start;
        }
        int mid=start+(end-start)/2;
        if ((mid<end)&&arr[mid]>arr[mid+1]){
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[start] >= arr[mid])
            return pivot(arr, start, mid - 1);
        return pivot(arr, mid + 1, end);
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
