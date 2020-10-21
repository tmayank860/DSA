package GFGAmazon.Arrays;

import java.util.ArrayList;

public class SubarraywithGivenSum {
    public static void main(String[] args) {
        int N = 42 ,S=468;
       int A[] = {
               135, 101 ,170 ,125, 79, 159 ,
               163 ,65, 106, 146, 82 ,28, 162, 92, 196, 143 ,28, 37, 192, 5, 103 ,154 ,93 ,183, 22, 117 ,119, 96 ,48, 127 ,172, 139, 70 ,113 ,68 ,100, 36 ,95 ,104 ,12 ,123, 134};
       int[] arr={1, 4, 3, 6, 7, 8,4};
       int n=6;
        System.out.println(subarraySum(n,15,arr));
    }

    static ArrayList<Integer> subarraySum(int n, int s, int[] m) {

        // Your code here
        int start=0,end=0;
        long sum=0;
        ArrayList<Integer> ls=new ArrayList<>();
        while (start<n&&end<n){
            sum=sum+m[end++];
            while(sum>s){
                sum-=m[start++];
            }
            if (sum==s){
                ls.add(start+1);
                ls.add(end);
                return ls;
            }
        }
        ls.add(-1);
        return ls;

    }
   static int maxProduct(int arr[], int n) {
        // code here
       int i, first, second;
       first = second = Integer.MIN_VALUE;
       for (i = 0; i < n; i++) {
           if (arr[i] > first) {
               second = first;
               first = arr[i];
           }
           else if (arr[i] > second && arr[i] != first)
               second = arr[i];
       }
       return first*second;
    }
}
