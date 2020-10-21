package RandomProblems;

import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        int [] arr={1,7,6,5,2};
        System.out.print(sumPair(arr,9));

    }

//    If array is sorted

    public static boolean sumPairSorted(int[] arr,int sum){
        int low=0,high=arr.length-1;
        while (low<high){
            int s=arr[low]+arr[high];
            if (s==sum){
                return true;
            }
            else if (sum>s){
                low++;
            }
            else if(s>sum){
                high--;
            }
        }
        return false;
    }

//     if array is not sorted
public static boolean sumPair(int[] arr,int sum){
    ArrayList<Integer> ls=new ArrayList<>();
    int s=0;
    for (int i=0;i<arr.length;i++){
        s=sum-arr[i];
        if (ls.contains(s)){
            return true;
        }else {
            ls.add(arr[i]);
        }
    }
    return false;
}

}
