package GFGAmazon.Searching;

public class FloorinaSortedArray {
    public static void main(String[] args) {
        long[] arr = {1,2,8,10,11,12,19};
       System.out.println(findFloor(arr,0,7,0));
    }

    static int findFloor(long[] arr, int left, int right, long x) {
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=x){
                left= mid+1;
            }else {
                right=mid-1;
            }
        }
        int indx=left-1;
        if (indx<0){
            return -1;
        }
        return left-1;
    }

}
