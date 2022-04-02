package GFG;

import java.util.ArrayList;

public class GFSeries {
    public static void main(String[] args) {
        gfSeries(6);
    }
    static void gfSeries(int N){
        // code here
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(0);
        ls.add(1);
        series(N,2,ls);
        for(int x:ls){
            System.out.print(x+" ");
        }
    }

    static void series(int N, int idx, ArrayList<Integer> ls){
        if(idx==N){
            return;
        }
        int current=ls.get(idx-2)*ls.get(idx-2)-ls.get(idx-1);
        ls.add(current);
        series(N,idx+1,ls);
    }
}
