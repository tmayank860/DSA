package CodeChef;

import java.util.Scanner;

public class ChefandEasyQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

int flag=0,c=0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] < k) {
                       flag=i+1;
                        break;
                    }else if (i==n-1){
                        c=arr[i]/k;
                }else {
                        arr[i+1]=arr[i+1]+arr[i]-k;
                    }

            }
            if (flag==0){
                System.out.println(c+n);
            }else {
                System.out.println(flag);
            }
        }
    }

}
