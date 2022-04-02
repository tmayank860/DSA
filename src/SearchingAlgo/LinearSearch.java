package SearchingAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={5,6,4,9,3,8,1};
        System.out.println(linearSearch(arr,60));
    }

    static boolean linearSearch(int[] arr, int target) {
        for (int x : arr
        ) {
            if (x == target) {
                return true;
            }
        }
        return false;
    }
}
