package GFGAmazon.Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int n=5;
long A[] = {1,3,5,2,2};
System.out.println(equilibriumPoint(A,n));
    }
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if (n==1){
            return 1;
        }
        long right_sum=0,sum=0;
        for (int i=0;i<n;i++){
sum=sum+arr[i];
        }
        for (int i=n-1;i>=0;i--){
            sum=sum-arr[i];
            if(sum==right_sum){
                return i+1;
            }

            right_sum+=arr[i];
        }
        return -1;
    }
}
