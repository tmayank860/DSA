import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DaysOfCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i=n-1;i>=0;i--){
            if (!ls.contains(nums[i])){
                ls.add(nums[i]);
            }
        }
        System.out.println(ls.size());
        for (int i=ls.size()-1;i>=0;i--){
            System.out.print(ls.get(i)+" ");
        }

    }
}
