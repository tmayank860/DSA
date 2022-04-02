package Arrays.gfg;

public class SearchInTwoD {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr,3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        int currentX=0,currentY=matrix[0].length-1;
        while (currentX<r&&currentY>=0){
            if (matrix[currentX][currentY]==target){
                return true;
            }else if(matrix[currentX][currentY]>target){
                currentY--;
            }else {
                currentX++;
            }
        }
        return false;
    }
}
