package GFGAmazon.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 0, 4};
        System.out.println(trappingWater(5,arr));
    }

//    Naive approach O(N2)

    static int trappingWater(int n,int[]arr){
        int max=0;
        for (int i=1;i<n-1;i++){
            int left=arr[i];
            for (int j=0;j<i;j++){
                left=Math.max(left,arr[j]);
            }
            int right=arr[i];
            for (int j=i+1;j<n;j++){
                right=Math.max(right,arr[j]);
            }
            max+=Math.min(left,right)-arr[i];
        }
        return max;
    }

//    Efficient approach O(N)

    static int trappingWater(int arr[], int n) {
        // Your code here
        int[] l_max=new int[n];
        l_max[0]=arr[0];
        int[] r_max=new int[n];
        r_max[n-1]=arr[n-1];
        for (int i=1;i<n;i++){
            l_max[i]=Math.max(arr[i],l_max[i-1]);
        }
        for (int i=n-2;i>=0;i--){
            r_max[i]=Math.max(arr[i],r_max[i+1]);
        }

        int res=0;
        for (int i=0;i<n;i++){
            res+=Math.min(l_max[i],r_max[i])-arr[i];
        }
        return res;
    }
}
