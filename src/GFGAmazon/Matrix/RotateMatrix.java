package GFGAmazon.Matrix;

public class RotateMatrix {
    public static void main(String[] args) {

    }

    static void rotateby90(int[][] matrix, int n) {
        // code here
        for (int i=0;i<n/2;i++){
            for (int j=i;j<n-1-i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][n-i-1];
                matrix[j][n-1-i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[n-1-j][i];
                matrix[n-1-j][i]=temp;
            }
        }
    }
}
