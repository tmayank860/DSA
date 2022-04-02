package Arrays.gfg;

import java.util.ArrayList;

public class DuplicateInArray {
    public static void main(String[] args) {
        int a[] = {0,3,1,2};
        System.out.println(duplicates(a,4));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[Math.abs(arr[i])]<0){
                ls.add(Math.abs(arr[i]));
            }else{
                arr[Math.abs(arr[i])]=-1*arr[arr[i]];
            }
        }
        if(ls.isEmpty()){
            ls.add(-1);
        }
        return ls;
    }
}
