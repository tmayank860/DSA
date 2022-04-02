package Arrays;

import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={2,2,2};
        System.out.println(remove(arr));
    }
    static  int remove(int[] Arr){

       int count=0;
        int val=1;
        for (int i=0;i<Arr.length;i++){
            if (Arr[i]==val){
                val++;
            }
        }
        return 1;
    }
}
