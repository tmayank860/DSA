package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class KeyPair {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

            int t=sc.nextInt();
            while(t-->0) {

            int n=sc.nextInt();
            int target=sc.nextInt();
            int[] nums=new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int flag=0;
            HashSet<Integer> hs=new HashSet<>();
            for (int i=0;i<n;i++){
                if (hs.contains(target-nums[i])){
                   flag=1;
                    break;
                }
                hs.add(nums[i]);
            }
            if (flag==1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}


