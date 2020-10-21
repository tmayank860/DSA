package GFGAmazon.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Removeduplicatesinsmallprimearray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 7, 5};
        int n = 6;
        System.out.println((removeDuplicate(arr, n).toString()));
    }

        // code here
      static ArrayList<Integer> removeDuplicate(int arr[], int n)
        {
            int a[] = new int[100];
            ArrayList<Integer> ls = new ArrayList<Integer>();
            for(int i=0; i<n; i++)
            {
                if(a[arr[i]]==0)
                {
                    a[arr[i]]=1;
                    ls.add(arr[i]);
                }
            }
            return ls;

    }
}
