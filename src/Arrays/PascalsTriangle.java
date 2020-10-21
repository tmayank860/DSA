package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> ls=generate(5);
        for (List<Integer> l:ls){
            System.out.println(l+" ");
        }
    }
    public static List<List<Integer>> generate(int numRows) {
//        int i=0;
        List<List<Integer>> ls=new ArrayList<>();
//        while (i<numRows){
//            List<Integer> ch=new ArrayList<>();
//            int x=(int) Math.pow(11,i);
//            String s=Integer.toString(x);
//            String[] c=s.split("");
//            int j=0;
//            while (j<c.length){
//                ch.add(Integer.parseInt(c[j]));
//                j++;
//            }
//            ls.add(ch);
//            i++;
//        }
//        List<List> rowList = new ArrayList<List>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    list.add(1);
                else
                    list.add(ls.get(i-1).get(j-1) + ls.get(i-1).get(j));
            }
            ls.add(list);
    }
        return ls;
    }
}
