package GFGAmazon.Arrays;

public class MinimumDistanceBetweenTwoNumber {
    public static void main(String[] args) {
int[] a={1,2,4,2};
System.out.println(minDist(a,4,1,2));
    }
     static int minDist(int a[], int n, int x, int y) {
        // code here
         int i=0,j=-1, min=Integer.MAX_VALUE;

         for(i=0 ; i<n ; i++)
         {
             if(a[i] ==x || a[i] == y)
             {
                 if(j != -1 && a[i] != a[j])
                     min = Math.min(min,i-j);
                 j=i;
             }
         }
         if(min==Integer.MAX_VALUE){
             return -1;
         }
         return min;
     }


}
