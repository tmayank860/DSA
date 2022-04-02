package Recursion;

import java.util.*;

public class FindingPosition {
    public static void main(String[] args) {
        System.out.println(nthPosition(9));
    }
    static long nthPosition(long n){
        // code here
        ArrayList<Long> ls=new ArrayList<>();
        for (long i=0;i<n;i++){
            ls.add(i+1);
        }
        while (ls.size()!=1){
            removeEven(ls);
            System.out.println(ls);
        }
return ls.get(0);
    }
    static void removeEven(ArrayList<Long> ls){
        for (int i = 0; i < ls.size(); i++) {
            if ((i+1)%2!=0){
                ls.set(i, (long) -1);
            }
        }
        for (int i = 0; i < ls.size(); i++
             ) {
            ls.remove((long)-1) ;
        }
    }
}
