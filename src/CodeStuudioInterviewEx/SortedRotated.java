package CodeStuudioInterviewEx;

import java.util.Arrays;

public class SortedRotated {
    public static void main(String[] args) {
        int[] nums={5,1,3};
        System.out.println(search(nums,3));

    }
    public static int search(int[] nums, int target) {
        int n=nums.length;
        if(nums.length==1&&nums[0]!=target){
            return -1;
        }
        int smallest= bs(nums);
        System.out.println(smallest);
        if(target==nums[smallest]){
            return smallest;
        }else if(smallest==0){
            return binarySearch(nums,0,nums.length-1, target);
        }else if(target>nums[smallest]&&target<=nums[nums.length-1]){
            return binarySearch(nums,smallest+1,nums.length-1, target);
        }else{
            return binarySearch(nums,0,smallest-1, target);
        }

    }
    static int bs(int[] arr){
        int low =0 , high = arr.length-1,n=arr.length;
        while(low<=high){
            int mid = low + (high-low)/2 ;
            int prev = (mid-1 + n)  %n , next = (mid+1)%n;//if first element is mid or
            //last element is mid then simply use modulo so it never goes out of bound.
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
                return mid;
            else if (arr[mid]<=arr[high])
                high = mid-1 ;
            else if (arr[mid]>=arr[low])
                low=mid+1;
        }
        return -1;
    }
    static int binarySearch(int[] nums,int l,int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }
        }
        return -1;
    }
}
