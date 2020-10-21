package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 6, 4, 4, 5, 5};
        int n = arr.length;
        System.out.print(Arrays.binarySearch(arr,6));

//
//        n = remove_duplicate(arr, n);
//
//        // Print updated array
//        for (int i=0; i<n; i++)
//            System.out.print(arr[i]+" ");
}

    static int remove_duplicate(int[] a, int N) {
        // Your code here
        int j=0;
        for (int i=0;i<N-1;i++){
            if (a[i]!=a[i+1]){
                a[j]=a[i];
                j++;
            }
        }
        a[j++]=a[N-1];
        return j;

    }
}
