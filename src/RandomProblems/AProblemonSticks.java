package RandomProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class AProblemonSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s=br.readLine();
            int[] nums=new int[n];
            int v = 0;
            StringTokenizer ex = new StringTokenizer(s);
            while (ex.hasMoreTokens()) {
                nums[v] = Integer.parseInt(ex.nextToken());
                v++;
            }
            HashSet<Integer> hs=new HashSet<>();
            for (int i=0;i<n;i++){
                hs.add(nums[i]);
            }
            System.out.println(hs.toString());
        }

    }
}
