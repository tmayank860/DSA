package Arrays.gfg;

import java.util.Arrays;

public class CountTheTriplets {
    public static void main(String[] args) {
        int[] arr={1,5,3,2};
        System.out.println(countTheTriplets(arr,4));

    }
    public static int countTheTriplets(int[] arr,int n){
        Arrays.sort(arr);
        int count=0;
        for (int i=n-1;i>=0;i--){
            int target=arr[i];
            int s=0,e=i-1;
            while (s<e){
                if (arr[s]+arr[e]==target){
                    count++;
                    s++;
                    e--;
                }else if (arr[s]+arr[e]>target){
                    e--;
                }else {
                    s++;
                }
            }
        }
if (count>0){
    return count;
}
        return -1;
    }
}
