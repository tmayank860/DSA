package GFGAmazon.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
//        mergeSort(arr,0,5);
//        System.out.println(Arrays.toString(arr));
        System.out.println(mergeSort(arr,0,4));

    }

    static int mergeSort(int[] arr, int left, int right) {
        int c=0;
        if (left < right) {
            int mid = left + (right - left) / 2;
           c+= mergeSort(arr, left, mid);
           c+= mergeSort(arr, mid + 1, right);
          c+=  merge(arr, left, mid, right);
        }
        return c;
    }

    static int merge(int[] arr, int left, int mid, int right) {
        int i, j, k,inv=0;
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
                inv+=mid+1-(left+i);
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return inv;

    }
}
