package GFGAmazon.Matrix;

import java.util.ArrayList;

public class Spirallytraversingamatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(spirallyTraverse(matrix, 3, 4).toString());
    }

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // code here
        int i, k = 0, l = 0, m, n,j;
        m = r;
        n = c;
        ArrayList<Integer> ls = new ArrayList<>();
        for (i = 0; i < r / 2; i++) {
            j = i;
            while (j < c - 1 - i) {
                ls.add(matrix[i][j]);
                j++;
            }
            k = i;
            while (k < r - 1 - i) {
                ls.add(matrix[k][j]);
                k++;
            }
            l = r - i - 1;
            if (i++<r) {
                while (l > i) {
                    ls.add(matrix[k][l]);
                    l--;
                }
            }
            m = c - 1 - i;
            if (j++<c) {
                while (m > i) {
                    ls.add(matrix[m][i]);
                    m--;
                }
            }
        }
//        while (k < m && l < n) {
//
//            for (i = l; i < n; i++) {
//                ls.add(matrix[k][i]);
//            }
//            k++;
//
//
//            for (i = k; i < m; i++) {
//                ls.add(matrix[i][n - 1]);
//            }
//            n--;
//
//
//            if (k < m) {
//                for (i = n - 1; i >= l; i--) {
//                    ls.add(matrix[m - 1][i]);
//                }
//                m--;
//            }
//
//            if (l < n) {
//                for (i = m - 1; i >= k; i--) {
//                    ls.add(matrix[i][l]);
//                }
//                l++;
//            }
//        }
        return ls;
    }
}

