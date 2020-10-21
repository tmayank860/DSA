package RandomProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrangeStudents {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(11);
        b.add(11);
        b.add(3);
        b.add(4);
        b.add(7);
//        b.add(9);
        System.out.print(arrangeStudents(a,b));


    }
    public static String arrangeStudents(List<Integer> a, List<Integer> b) {
        // Write your code here
//        ArrayList<Integer> ls=new ArrayList<>();

        int n=a.size();
        int[] arr=new int[2*n];
        int i=0,j=0,k=0;
      if (a.get(0)<b.get(0)){
          while (i<n||j<n){
              arr[k++]=a.get(i++);
              arr[k++]=b.get(j++);
          }
      }else {
          while (i<n||j<n){
              arr[k++]=b.get(j++);
              arr[k++]=a.get(i++);

          }
      }
        String s1=Arrays.toString(arr);
      Arrays.sort(arr);
      if (s1.equals(Arrays.toString(arr))){
          return "YES";
      }
return "NO";
    }
}
