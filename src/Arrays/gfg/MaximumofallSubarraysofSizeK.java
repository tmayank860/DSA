package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaximumofallSubarraysofSizeK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = 1;
//        Integer.parseInt(br.readLine());
        while (t-- > 0) {
//            String[] input1 = br.readLine().split(" ");
            int n = 9;
//            Integer.parseInt(input1[0]);
            int k = 3;
//            Integer.parseInt(input1[1]);
            int[] arr = new int[n];
            String a ="1 2 3 1 4 5 2 3 6";
//            br.readLine();
            int v = 0;
            StringTokenizer ex = new StringTokenizer(a);
            while (ex.hasMoreTokens()) {
                arr[v] = Integer.parseInt(ex.nextToken());
                v++;
            }
//           int start=0;
//            while (start<=n-k){
//                int max=arr[0];
//                for (int i=start;i<k+start;i++){
//                    if (max<arr[i]){
//                        max=arr[i];
//                    }
//                }
//                System.out.print(max+" ");
//                start++;
//            }
            maxOfSubarray(arr,n,k);
            System.out.println();

        }
    }
    static void maxOfSubarray(int[] arr,int n,int k){
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for (i = 0; i < k; ++i) {

            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast(); // Remove from rear


            Qi.addLast(i);
        }


        for (; i < n; ++i) {

            System.out.print(arr[Qi.peek()] + " ");


            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();


            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();


            Qi.addLast(i);
        }


        System.out.print(arr[Qi.peek()]);
    }
}
