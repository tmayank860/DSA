package GFGAmazon.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionofTwoSortedArrays {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<n;i++){
            if (!hs.contains(arr1[i])){
                hs.add(arr1[i]);
            }
        }
        for (int i=0;i<m;i++){
            if (!hs.contains(arr2[i])){
                hs.add(arr2[i]);
            }
        }
        ArrayList<Integer> ls=new ArrayList<>(hs);
        Collections.sort(ls);
return ls;
    }
}
