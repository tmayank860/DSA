package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HelpfulMaths {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int v = 0,i=0;
        int[] arr = new int[s.length() / 2+1];
       while (v<s.length()){
           if (s.charAt(v)!='+'){
               arr[i++]=Integer.parseInt(s.charAt(v)+"");
           }
           v++;
       }
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high){
            if (arr[mid]==1){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if (arr[mid]==2){
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
        for (int j=0;j<arr.length;j++){
            if (j<arr.length-1) {
                System.out.print(arr[j]);
                System.out.print("+");
            }else {
                System.out.print(arr[j]);
            }
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
