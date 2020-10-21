package Arrays.gfg;

import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int t=1;
//            sc.nextInt();
                while(t-->0) {
                    int repeated=0,missing=0;
                    int n=3;
//                    sc.nextInt();
                    int[] nums={1,3,3};
//                    new int[n];

                    for(int i=0;i<n;i++){
                        int temp=Math.abs(nums[i]);
                        if(nums[temp-1]>0){
                            nums[temp-1]=-1*nums[temp-1];
                        }else{
                            repeated=temp;
                        }
                    }
                    for(int i=0;i<n;i++){
                        if(nums[i]>0){
                            missing=i+1;
                        }
                    }
                    System.out.println(repeated+" "+missing);
                }
        } catch (Exception e) {

        }
    }
}
