package GFGAmazon.Arrays;

import java.util.ArrayList;

class Pair {
    int l, r;

    public Pair(int l, int r) {
        this.l = l;
        this.r = r;
    }

}

public class MountainSubarrayProblem {

    public static void main(String[] args) {

    }

    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,
                                             int q) {
        // code here
        int[] left = new int[n];
        int[] right = new int[n];
        int current = 0;
        left[0] = 0;
        right[n - 1] = n - 1;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] < a[i]) {
                current = i;
            }
            left[i] = current;
        }
        current = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) {
                current = i;
            }
            right[i] = current;
        }
        ArrayList<Boolean> ls = new ArrayList<>();
        int start = 0;
        while (start-- < q) {
            if (left[queries.get(start).l] < right[queries.get(start).r]) {
                ls.add(true);
            } else {
                ls.add(false);
            }
        }
        return ls;
    }
}
