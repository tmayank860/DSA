package CodeStuudioInterviewEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PositiveNegativePair {
    public static void main(String[] args) {
        int[] arr = {-2, 8, 2, 5, -2, -5};
        System.out.println(countPositiveNegativePairs(arr));
    }

    public static long countPositiveNegativePairs(int[] arr) {
//For all distinct pair
//    {
//        //Write your code here
//        ArrayList<Integer> ls=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            ls.add(arr[i]);
//        }
//        int count =0;
//        for(int i=0;i<arr.length;i++){
//            if(!ls.isEmpty()&&ls.contains(-1*arr[i])){
//                ls.remove(i-count);
//                count++;
//            }
//        }
//        return count;
//    }

//for all pairs
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i] )+ 1);
//            } else {
//                map.put(arr[i], 1);
//            }
//        }
//        int count = 0;
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i]<0&&map.containsKey(-1 * arr[i])) {
//                count += Math.min(map.get( arr[i]), map.get(-1* arr[i]));
//            }
//        }
//        return count;
        //More optimal two pointer
        Arrays.sort(arr);
        int l=0,r=arr.length-1,count=0;
        while (l<r){
            if (arr[l]+arr[r]==0){
                count++;
                int x=r-1;
                while (arr[x--]+arr[l]==0){
                    count++;
                }
                x=0;
                l++;
            }else if (arr[l]+arr[r]>0){
                r--;
            }else {
                l++;
            }
        }
        return count;
    }
}
