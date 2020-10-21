package GFGAmazon.Arrays;

import java.util.ArrayList;

public class SortedSubsequenceOfSize3 {
    public static void main(String[] args) {
        int N = 5;
        int A[] = {1,2,1,1,3};

        ArrayList<Integer> l=new ArrayList<>();
        for (int i=0;i<N;i++){
            l.add(A[i]);
        }
        System.out.println(find3Numbers(l,N).toString());
    }
   static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
//        int[] arr_l=new int[n];
//        int[] arr_r=new int[n];
//       int max = n - 1;
//       int min = 0;
//       arr_l[0]=-1;
//        arr_r[n-1]=-1;
//        for (int i=1;i<n;i++){
//            if (arr.get(i-1)<arr.get(min)){
//                min=i;
//                arr_l[i]=-1;
//            }else {
//                arr_l[i]=min;
//            }
//        }
//        for (int i=n-2;i>=0;i--){
//            if (arr.get(i+1)>arr.get(max)){
//                max=i;
//                arr_r[i]=-1;
//            }else {
//                arr_r[i]=max;
//            }
//        }
//        ArrayList<Integer> ls=new ArrayList<>();
//for (int i=0;i<n;i++){
//    if (arr_l[i] != -1 && arr_r[i] != -1) {
//        ls.add(arr.get(arr_l[i]));
//        ls.add(arr.get(i));
//        ls.add(arr.get(arr_r[i]));
//        return ls;
//    }
//}
//return ls;
       int max = n - 1;
       int min = 0;
       int i = 0;

       int[] smaller = new int[n];
       smaller[0] = -1; // first entry will always be -1
       for (i = 1; i < n; i++) {
           if (arr.get(i) <= arr.get(min)) {
               min = i;
               smaller[i] = -1;
           } else
               smaller[i] = min;
       }

       int[] greater = new int[n];
       greater[n - 1] = -1; // last entry will always be -1
       for (i = n - 2; i >= 0; i--) {
           if (arr.get(i) >= arr.get(max)) {
               max = i;
               greater[i] = -1;
           } else
               greater[i] = max;
       }
       ArrayList<Integer> r = new ArrayList<Integer>();

       for (i = 0; i < n; i++) {
           if (smaller[i] != -1 && greater[i] != -1) {

               r.add(arr.get(smaller[i]));
               r.add(arr.get(i));
               r.add(arr.get(greater[i]));
               return r;
           }
       }

       return r;
    }
}
