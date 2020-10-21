package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        ArrayList<Boolean> ls=new ArrayList<>();
        for (int i=0;i<candies.length;i++){
            if (max<candies[i]){
                max=candies[i];
            }
        }
        for (int i=0;i<candies.length;i++){
            if (candies[i]+extraCandies>max){
                ls.add(true);
            }else {
                ls.add(false);
            }
        }
        return ls;
    }
}
