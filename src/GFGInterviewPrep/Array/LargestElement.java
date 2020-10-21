package GFGInterviewPrep.Array;

import java.util.ArrayList;

public class LargestElement {
    public static void main(String[] args) {

    }
    public static int largestElement(int [] arr,int n){
        int indx=0;
        for (int i=0;i<n;i++){
            if (arr[i]>arr[indx]){
                indx=i;
            }
          
        }
        return indx;
    }
    public static int secondLargest(int[] arr,int n){
        int max=0,l=0,s=0;
        for (int i=0;i<n;i++){
            if (arr[i]>arr[s]){

            }
        }
        return s;
    }
}
