package GFGAmazon.Searching;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3};
        System.out.println(countOccurence(arr, 6, 3));
    }

    public static int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        int c = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > n / k) {
                c++;
            }
        }
        return c;

    }
}
