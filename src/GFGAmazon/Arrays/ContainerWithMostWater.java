package GFGAmazon.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
int a[] = {34 ,1 ,69, 24, 78, 58, 62, 64, 5 ,45 ,81 ,27, 61, 91 ,95, 42 ,27};
System.out.println(maxArea(a,17));
    }

   static long maxArea(int A[], int len){
        // Code Here
        long max_area=Long.MIN_VALUE;
        int i=0,j=len-1;
        while (i<j){
            long area=(j-i)*(Math.min(A[i],A[j]));
            max_area=Math.max(max_area,area);
           if (A[i]<A[j]){
               i++;
           }else {
               j--;
           }
        }
        return max_area;
    }
}
