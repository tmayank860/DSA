package CBonlineTest;

import java.util.Scanner;

public class MedianInAStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =1;
//        sc.nextInt();
        while (t-- > 0) {
            int n = 6;
//            sc.nextInt();
            int[] arr ={5,15,1,3,2,8};
//            new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
            int[] result = new int[n];
            int i = 0, j = 0;
            while (i < n) {
            if (i == 0) {
                result[j++] = arr[i];
            } else if (i == 1) {
                result[j++] = (arr[0] + arr[i]) / 2;
            } else {

                    if (i % 2 == 0) {
                        result[j++] = (arr[(int) Math.floor(i / 2)] + arr[(int) Math.ceil(i / 2)]);
                    }
                    else {
                        result[j++]=arr[(i/2)+1];
                    }
                }
            i++;
            }
            for (int x:result
                 ) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
