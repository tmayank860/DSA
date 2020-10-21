package GFGAmazon.Searching;

import java.util.HashSet;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while (t-->0){
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[m];
    for (int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }
    for (int i=0;i<m;i++){
        arr2[i]=sc.nextInt();
    }
    HashSet<Integer> hs=new HashSet<>();
    for (int i=0;i<m;i++){
        hs.add(arr2[i]);
    }
    for (int i=0;i<n;i++){
        if (!hs.contains(arr1[i])){
            System.out.print(arr1[i]+" ");
        }
    }
    System.out.println();

}
    }

//    static int majorityElement(int a[], int size) {
//        // your code here
//
//
//    }
}
