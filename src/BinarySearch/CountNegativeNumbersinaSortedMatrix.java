package BinarySearch;

public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(countNegatives(arr));

    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for (int[] col : grid) {
            int firstNegitaveIndex = bs(col);
            if (firstNegitaveIndex >= 0) {
                count = count + (grid[0].length - firstNegitaveIndex);
            }
        }
        return count;
    }

    public static int bs(int[] arr) {
        if (arr[0]<0){
            return 0;
        }
        int l = 0, r = arr.length - 1;


        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < 0 && mid > 0 && arr[mid - 1] >= 0) {
                return mid;
            }
            else if (arr[mid] < 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
