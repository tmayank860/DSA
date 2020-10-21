package Arrays.gfg;

import java.util.HashSet;
import java.util.Scanner;

public class pairsWithaGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int N = sc.nextInt();
                int M = sc.nextInt();
                int X = sc.nextInt();
                HashSet<Integer> hs=new HashSet<>();
                for (int i=0;i<N;i++){
                    hs.add(sc.nextInt());
                }
                int[] arr=new int[M];
                for(int i=0;i<M;i++){
                    arr[i]=sc.nextInt();
                }
                StringBuilder s= new StringBuilder();

                for (int i=0;i<M;i++){
                    if (hs.contains((X-arr[i]))){
                        s.append(arr[i]).append(" ").append(X - arr[i]).append(", ");
                    }
                }
                if (s.length()!=0) {
                    s.reverse();
                    System.out.println(s.subSequence(1, s.length() - 1));
                }else {
                    System.out.println("-1");
                }
            }
        } catch (Exception e) {

        }

    }
}
