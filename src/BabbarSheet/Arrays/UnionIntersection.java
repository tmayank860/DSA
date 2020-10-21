package BabbarSheet.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 1,3,5};
        int[] b = {2, 2,3};
        System.out.println("Union--->"+union(a,b,5,3).toString());
        System.out.println("Intersection--->"+intersection(a,b,5,3).toString());
    }
    static ArrayList<Integer> intersection(int [] a,int[] b,int m,int n){
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<m;i++){
            hs.add(a[i]);
        }
        ArrayList<Integer> ls =new ArrayList<>();
        for (int i=0;i<n;i++){
            if (hs.contains(b[i])){
                ls.add(b[i]);
                hs.remove(b[i]);
            }
        }
        return ls;
    }

    static ArrayList<Integer> union(int []a,int[] b,int m,int n){
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<m;i++) {
            hs.add(a[i]);
        }
        for (int i=0;i<n;i++){
            hs.add(b[i]);
        }
        ArrayList<Integer> ls=new ArrayList<>(hs);
        return ls;

    }
}
