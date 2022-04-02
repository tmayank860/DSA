package LeetCodeMarch;

import java.util.ArrayList;
import java.util.List;

public class ChampagenTower {
    public static void main(String[] args) {
//        System.out.println(champagneTower(100000009,33,1));
        System.out.println(hammingWeight(00000000000000000000000000011011));
    }
    public static double champagneTower(int poured, int query_row, int query_glass) {
        ArrayList<Double> prev_row=new ArrayList<>();
       prev_row.add(poured*1d);
        while (query_row-->0){
            ArrayList<Double> current_row=new ArrayList<>();
            current_row.add(Math.max(0,(prev_row.get(0)-1)/2));
            for (int i = 1; i < prev_row.size(); i++) {
                current_row.add(Math.max((prev_row.get(i-1)-1)/2,0)+Math.max((prev_row.get(i)-1)/2,0));
            }
            current_row.add(current_row.get(0));
            prev_row=new ArrayList<>(current_row);
//            System.out.println(prev_row);
        }

        return Math.min(1.0,prev_row.get(query_glass));
    }

    public static int hammingWeight(int n) {
        String s=String.valueOf(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

}
