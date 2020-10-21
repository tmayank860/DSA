package GFGAmazon.Arrays;

public class SticklerThief {
    public static void main(String[] args) {
int a[] = {5,5,10,100,10,5};
System.out.println(FindMaxSum(a,6));
    }
    public static int FindMaxSum(int[] arr, int n){
        // Your code here
        int inc=arr[0];
        int exc=0;
        int new_exc=0;
        for (int i=1;i<n;i++){
            if (exc>inc){
                new_exc=exc;
            }else {
                new_exc=inc;
            }
            inc=exc+arr[i];
            exc=new_exc;
        }
        return Math.max(inc,exc);
    }
}
