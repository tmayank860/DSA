package GFGAmazon.Arrays;

public class MaxSumPathInTwoArrays {
    public static void main(String[] args) {
       int M = 5, N = 4;
       int A[] = {2,3,7,10,12};
       int B[] = {1,5,7,8};
       System.out.println(maxPathSum(A,B));
    }

   static int maxPathSum(int ar1[], int ar2[]) {
        // Your code here
        int sum1=0,sum2=0,i=0,j=0,result=0;
        int n=ar1.length,m=ar2.length;
        while (i<n&&j<m){
            if (ar1[i]<ar2[j]){
                sum1+=ar1[i++];
            }
           else if (ar1[i]>ar2[j]){
                sum2+=ar2[j++];
            }
            else if (ar1[i]==ar2[j]){
                 result = Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < m &&  j < n && ar1[i] == ar2[j])
                {
                    result = result + ar1[i++];
                    j++;
                }
            }

        }
        while (i<n){
            sum1+=ar1[i++];
        }
        while (j<m){
            sum2=ar2[j++];
        }
       result +=Math.max(sum1, sum2);
return result;
    }
}
