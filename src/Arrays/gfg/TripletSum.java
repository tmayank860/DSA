package Arrays.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        if(n<3){
            return false;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int current=arr[i];
            int l=i+1,r=n-1;
            while(l<r&&l<n&&r>i){
                if(current+arr[l]+arr[r]==0){
                    return true;
                }else if(current+arr[l]+arr[r]>0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return false;
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;

        List<List<Integer>> res=new ArrayList<>();
        if(n<3){
            return res;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int current=arr[i];
            int l=i+1,r=n-1;
            List<Integer> ls=new ArrayList();
            while(l<r&&l<n&&r>i){
                if(current+arr[l]+arr[r]==0){
                    ls.add(current);
                    ls.add(arr[l]);
                    ls.add(arr[r]);
                    l++;
                    r--;
                    break;
                }else if(current+arr[l]+arr[r]>0){
                    r--;
                }else{
                    l++;
                }
            }
            if (!ls.isEmpty()){

            res.add(new ArrayList<>(ls));
            }
        }
        return res;
    }

}
