package SearchingAlgo;

public class BinrySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,14,15,56,67,79};
//        System.out.println(iterativeBinarySearch(arr,57));
        System.out.println(recursiveBinarySearch(arr,56,0,9));

    }
    public static int iterativeBinarySearch(int[] arr, int target){
        int start=0, end=9;
        int mid;
        while (start<end){
            mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid+1;
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int target,int start,int end){
        if (start<=end && start<=arr.length-1){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid+1;
            }
            else if (arr[mid]>target){
              return recursiveBinarySearch(arr,target,start,mid-1);
            }
            else {
               return recursiveBinarySearch(arr,target,mid+1,end);
            }
        }
        return -1;
    }
}
