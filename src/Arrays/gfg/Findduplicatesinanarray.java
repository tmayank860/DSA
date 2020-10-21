package Arrays.gfg;

import java.util.ArrayList;
import java.util.HashSet;

public class Findduplicatesinanarray {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ls=new ArrayList<>();
      for (int i=0;i<n;i++){
          int indx=arr[i]%n;
          arr[indx]=arr[indx]+n;
      }
      for (int i=0;i<n;i++){
          if (arr[i]/n>1){
              ls.add(i);
          }
      }
      if (ls.isEmpty()){
          ls.add(-1);
      }
      return ls;

    }
}
