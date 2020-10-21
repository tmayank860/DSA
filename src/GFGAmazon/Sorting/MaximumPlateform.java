package GFGAmazon.Sorting;

import java.util.Arrays;

public class MaximumPlateform {
    public static void main(String[] args) {
       int arr[] = {900  ,940, 950,  1100, 1500 ,1800};
        int dep[] = {910, 1200 ,1120 ,1130 ,1900, 2000};
        System.out.println(findPlatform(arr,dep,6));
    }

    static int findPlatform(int arr[], int dep[], int n) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=1,max_plateform=1,required_plateform=1;
        while (i<n&&j<n){
            if (dep[i]<arr[j]){
                i++;
                max_plateform--;
            }else if (dep[i]>=arr[j]){
                j++;
                max_plateform++;
                if (max_plateform>required_plateform){
                    required_plateform=max_plateform;
                }
            }
        }
        return required_plateform;
    }
}
