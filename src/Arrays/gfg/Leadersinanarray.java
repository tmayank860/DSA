package Arrays.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leadersinanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
for (int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
                leader(arr, n);
            }
        } catch (Exception e) {

        }
    }

    public static void leader(int[] arr, int n) {
//        List<Integer> ls=new ArrayList<>();
//        ls.add(arr[n-1]);
//        StringBuilder s=new StringBuilder();
        String s = "";
        int c_max = arr[n - 1];
        s = c_max + " ";
//        System.out.print(c_max + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= c_max) {
                c_max = arr[i];
                s = c_max + " " + s;
            }
        }
        System.out.println(s);
    }
}
