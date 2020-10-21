package GFGAmazon.Searching;

import java.util.Scanner;

public class MajortyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean limit=false;
            for (int i = 1; i < n; i++){
                if (arr[i]>=arr[i-1])
                {
                    limit=true;
                    break;
                }

        }
        if (limit){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
}
