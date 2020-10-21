package GFGInterviewPrep.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintNonRepeatedElements {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,6,7};
        int n=10;
        ArrayList<Integer> ls= printNonRepeated(arr,n);
        for (int i:ls){
            System.out.println(i);
        }
    }
    static ArrayList<Integer> printNonRepeated(int[] arr, int n)
    {
        // add your code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i=0;i<n;i++) {
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i] + 1));
            } else {
                hs.put(arr[i], 1);
            }
        }
        ArrayList<Integer> ls=new ArrayList<>();
        return ls;

    }
}
