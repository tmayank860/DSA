package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MajorityElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t =
        Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String input1 = br.readLine();
            int n =
            Integer.parseInt(input1);
            int[] arr =
                    new int[n];
            String a = br.readLine();
            int v = 0;
            StringTokenizer ex = new StringTokenizer(a);
            while (ex.hasMoreTokens()) {
                arr[v] = Integer.parseInt(ex.nextToken());
                v++;
            }
            Arrays.sort(arr);
            int s=arr[0],c=0,flag=0;
            for (int i=0;i<n;i++){
                if (arr[i]==s){
                    c++;
                    if (c>n/2){
                        flag=1;
                        System.out.println(arr[i]);
                        break;
                    }
                }else {
                    s=arr[i];
                    c=1;
                }
            }
//            int low=0,high=n-1;
////            flag=0;
//            while (low<high-2){
//                if (arr[low]==arr[low+n/2]){
//                    flag=1;
//                    System.out.println(arr[low]);
//                    break;
//                }else {
//                    low++;
//                }
//            }
            if (flag==0){
                System.out.println(-1);
            }
        }
    }
}
