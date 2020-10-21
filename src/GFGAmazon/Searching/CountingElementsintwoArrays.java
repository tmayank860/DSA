package GFGAmazon.Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingElementsintwoArrays {
    public static void main(String[] args) {
        int[] arr1={4 ,8, 7, 5, 1};
        int[] arr2={4,48,3,0,1,1,5};
        System.out.println(countEleLessThanOrEqual(arr1,arr2,5,7).toString());

    }

    public static ArrayList<Integer> countEleLessThanOrEqual(int[] arr1, int[] arr2, int m, int n) {
        // add your code here
        Arrays.sort(arr2);
        int i=0,start=0,end=n-1;
        ArrayList<Integer> ls=new ArrayList<>();
        while (i<m){
            ls.add(count(arr2,start,end,arr1[i])+1);
            i++;
        }
        return ls;

    }
    static int count(int[]arr2,int start,int end,int x){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr2[mid]<=x){
               start= mid+1;
            }else {
                end=mid-1;
            }
        }
        return end;
    }

}
