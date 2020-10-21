package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StockBuyandSell {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
//        int n=10;
            int[] nums = new int[n];
            String a = bufferedReader.readLine();
//        String a="23 13 25 29 33 19 34 45 65 67";
            int v = 0;
            StringTokenizer ex = new StringTokenizer(a);
            while (ex.hasMoreTokens()) {
                nums[v] = Integer.parseInt(ex.nextToken());
                v++;
            }
            ArrayList<Integer> max=new ArrayList<>();
            ArrayList<Integer> min=new ArrayList<>();
            if (nums[0]>nums[1]){
                max.add(0);
            }else {
                min.add(0);
            }
            for (int i=1;i<n-1;i++){
        if (nums[i-1]>nums[i]&&nums[i]<nums[i+1]){
            min.add(i);
        }else if(nums[i-1]<nums[i]&&nums[i]>nums[i+1]){
            max.add(i);
        }
            }
            if (nums[n-1]>nums[n-2]){
                max.add(n-1);
            }else if(nums[n-1]<nums[n-2]){
                min.add(n-1);
            }
            int mx=0,mn=0,flag=0;
                while(mx<max.size()&&mn<min.size()) {
                    if (min.get(mn) < max.get(mx)) {
                        flag=1;
                        System.out.print("(" + min.get(mn) + " " + max.get(mx) + ") ");
                        mn++;
                        mx++;
                    }else {
                        mx++;
                    }

                }
if (flag==0){
    System.out.print("No Profit");
}
        System.out.println();
        }
    }
}
