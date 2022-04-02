package Arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        long arr[]={1,2,1};
        System.out.println(Arrays.toString(nextLargerElement(arr,3)));
    }
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] res=new long[n];
        for (int i=0;i<n;i++){
            long current=arr[i];
            boolean flag=false;
            for (int j=i+1;j<n;j++){
                if (arr[j]>current){
                    current=arr[j];
                    flag=true;
                    break;
                }
            }
            res[i]=flag?current:-1;
        }
        return res;
    }
}
