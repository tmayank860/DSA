package GFGAmazon.Matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
//int matrix[][] = {{ 3, 30, 38},
//        {36, 43, 60},
//        {40, 51, 69}};
//System.out.println(search(matrix,3,3,30));
        int[] arr={4,1,1};
        System.out.println(countDistinct(arr,3,2).toString());

    }

   public static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> ls=new ArrayList();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++) {
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        ls.add(hm.size());
        for (int i=k;i<n;i++){
            if (hm.get(A[i-k])==1){
                hm.remove(A[i-k]);
            }else {
                hm.put(A[i-k],hm.get(A[i-k])-1);
            }
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            ls.add(hm.size());
        }

        return ls;

    }

    static boolean search(int matrix[][], int n, int m, int x) {
        // code here
        int i,j=0,k=m-1;
        while (j<n&&k>=0){
            int current=matrix[j][k];
            if (current==x){
                return true;
            }else if (current>x){
                k--;
            }else {
                j++;
            }
        }
        return false;
    }
}
