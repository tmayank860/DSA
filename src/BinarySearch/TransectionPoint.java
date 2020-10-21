package BinarySearch;

public class TransectionPoint {
    public static void main(String[] args) {
        int[]arr={0,0,0,1};
System.out.println(transitionPoint(arr,4,0,3));
    }
    static int transitionPoint(int arr[], int n,int start,int end) {
        // code here
        if (start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid]==1) {
                if (arr[mid - 1] == 0) {
                    return mid;
                }
            }if (arr[mid]==0){
                  return transitionPoint(arr,n,mid+1,end);
                }if (arr[mid]==1){
                   return transitionPoint(arr,n,start,mid-1);
                }
            }

        return -1;

    }
}
