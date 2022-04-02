import java.util.ArrayList;
import java.util.Arrays;

public class SortJumblled {
    public static void main(String[] args) {
        int[] mapping={8,9,4,0,2,1,3,5,7,6};
        int[] nums={991,338,38};
        System.out.println(Arrays.toString(sortJumbled(mapping,nums)));
    }
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int new_num=0;
            while (num>0){
                int rem=mapping[num%10];
                new_num=new_num*10+rem;
                num=num/10;
            }
            if(ls.contains(new_num)){
                ls.indexOf(new_num);
                ls.set( ls.indexOf(new_num),nums[ ls.indexOf(new_num)]);
            }else {
                ls.add(new_num);
            }
        }
        System.out.println("List=> "+ls);
        Arrays.sort(nums);
        return nums;
    }
}
