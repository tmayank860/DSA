package GFGAmazon.Matrix;

import java.util.ArrayList;

public class BoundaryTraversal {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here
        ArrayList<Integer> ls=new ArrayList<>();
        int i,k=0,l=0;
        while (k<1&&l<1){
            for (i=l;i<m;i++){
                ls.add(matrix[k][i]);
            }
            k++;
            for (i=k;i<n;i++){
                ls.add(matrix[i][m-1]);
            }
            m--;
            if (k<n){
                for (i=m-1;i>=l;i--){
                    ls.add(matrix[n-1][i]);
                }
                m--;
            }
            if (l<m){
                for (i=n-1;i>=k;i--){
                    ls.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ls;
    }
}
