package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Stocks {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(2);
        ls.add(3);
        ls.add(5);
        System.out.println(stockMonth(ls));
    }
    public static int stockMonth(List<Integer> stockPrice){
        List<Integer> left =new ArrayList<>();
        List<Integer> right =new ArrayList<>();
        int avg=0,i=0;
        for (int x:stockPrice
             ) {
            avg+=x;
            ++i;
            left.add((int)Math.floor(avg/i));
        }
        avg=0;
        while (i>0){
            avg+=stockPrice.get(i-1);
            right.add((int)Math.floor(avg/(stockPrice.size()-i+1)));
            i--;
        }
        System.out.println(left);
        System.out.println(right);
        int minPos=Integer.MAX_VALUE;
        int l=0,r= right.size()-1;
        while (l<left.size()-2&&r>0){
            int currentMin=Math.abs(left.get(l)-right.get(r));
            if (currentMin<minPos){
                i++;
                minPos=Math.min(minPos,currentMin);
            }
            l++;
            r--;
        }
        return minPos+1;
    }
}
