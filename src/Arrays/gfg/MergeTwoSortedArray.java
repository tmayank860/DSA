package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MergeTwoSortedArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] input1=br.readLine().split(" ");
            int n= Integer.parseInt(input1[0]);
            int m= Integer.parseInt(input1[1]);
            int[] arr=new int[n];
            int[] arr2=new int[m];
            String a=br.readLine();
            int v=0;
            StringTokenizer ex=new StringTokenizer(a);
            while(ex.hasMoreTokens()){
                arr[v]=Integer.parseInt(ex.nextToken());
                v++;
            }

            String b=br.readLine();
            int v2=0;
            StringTokenizer ex2=new StringTokenizer(b);
            while(ex2.hasMoreTokens()){
                arr2[v2]=Integer.parseInt(ex2.nextToken());
                v2++;
            }
            //   merge(arr1,arr2,n,m);
            int i=0;
            int i1=0;
            int i2=0;
            StringBuilder ans = new StringBuilder();
            while(i<n+m){
                if(i1<n && i2<m){
                    if(arr[i1]<arr2[i2]){
                        ans.append(String.valueOf(arr[i1])+" ");
                        i1++;
                    }else{
                        ans.append(String.valueOf(arr2[i2])+" ");
                        i2++;
                    }
                }else{
                    if(i1>=n){
                        ans.append(String.valueOf(arr2[i2]+ " "));
                        i2++;
                    }else if(i2>=m){
                        ans.append(String.valueOf(arr[i1])+" ");
                        i1++;
                    }

                }
                i++;

            }
            System.out.println(ans);
        }

    }
    static void merge(int[]arr1,int[]arr2,int n,int m){
        int i=0,j=0;
        while (i<n&&j<m){
            if (arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }else if (arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        if (i==n){
            while (j<m) {
                System.out.print(arr2[j]+" ");
                j++;
            }
        } else{
            while (i<n) {
                System.out.print(arr1[i]+" ");
                i++;
            }
        }
    }
}
