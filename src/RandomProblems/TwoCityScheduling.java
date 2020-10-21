package RandomProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

    public static void main(String[] args) {
        int arr[][]={{10,20},{30,200},{400,50},{30,20}};
        System.out.print(twoCitySchedCost(arr));
    }

    public static int twoCitySchedCost(int[][] costs) {
            Comparator<int[]> c=new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]);
                }
            };
            Arrays.sort(costs,c);
            int cA=0,cB=0,n=costs.length,res=0;
            for (int i=0;i<n;i++){
                if (cA<n/2&&cB<n/2){
                    if (costs[i][0]<costs[i][1]){
                        cA++;
                        res+=costs[i][0];
                    }else {
                        cB++;
                        res+=costs[i][1];
                    }
                }
                else if (cA<n/2){
                    cA++;
                    res+=costs[i][0];
                }else if(cB<n/2){
                    cB++;
                    res+=costs[i][1];
                }
            }
            return res;
        }

}
