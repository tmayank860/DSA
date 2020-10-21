package GFGAmazon.Arrays;

import java.util.HashSet;

public class IntersectionOFTwoArrays {
    public static void main(String[] args) {

    }
    public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
    {
        //Your code here
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<n;i++){
            hs.add(a[i]);
        }
        for (int i=0;i<m;i++){
            if(hs.contains(b[i])){
                count++;
                hs.remove(b[i]);
            }
        }
return count;
    }
}
