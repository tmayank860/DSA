package Arrays;

import java.util.ArrayList;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        l = reverseInGroups(ls, 8, 3);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }

    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        // add your code here
        ArrayList<Integer> ls = new ArrayList<>();
        int j = 0;
        int remains=n%k;
        for (int i = 0; i < n; i += k) {
            int x = k;
            while (x > 0&&j<(n-n%k)) {
                    ls.add(mv.get(x + i - 1));
                    x--;
                    j++;

            }
        }
        while (j++<mv.size()){
            ls.add(mv.get(n-1));
            n--;
        }
        return ls;
    }

}
