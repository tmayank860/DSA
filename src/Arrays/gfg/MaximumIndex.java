package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaximumIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String input1 = br.readLine();
            int n = Integer.parseInt(input1);
            int[] arr = new int[n];
            String a = br.readLine();
            int v = 0;
            StringTokenizer ex = new StringTokenizer(a);
            while (ex.hasMoreTokens()) {
                arr[v] = Integer.parseInt(ex.nextToken());
                v++;
            }
            int RMax[] = new int[n];
            int LMin[] = new int[n];
          RMax[n-1]=arr[n-1];
          for (int i=n-2;i>=0;i--){
              RMax[i]=Math.max(arr[i],RMax[i+1]);
          }
          LMin[0]=arr[0];
          for (int i=1;i<n;i++){
              LMin[i]=Math.min(arr[i],LMin[i-1]);
          }
          int i=0,j=0,result=-1;
          while (i<n&&j<n){
              if (LMin[i]<=RMax[j]){
                  result=Math.max(result,j-i);
                  j++;
              }else {
                  i++;
              }
          }
          System.out.println(result);
        }
    }
}
