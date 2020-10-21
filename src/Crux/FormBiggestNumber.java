package Crux;

import java.util.*;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int tc=sc.nextInt();
            while (tc-->0) {

                ArrayList<String> ls = new ArrayList<>();
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    int x=sc.nextInt();
                    ls.add(Integer.toString(x));
                }
                ls.sort((X, Y) -> {
                    String XY = X + Y;
                    String YX = Y + X;
                    return XY.compareTo(YX) > 0 ? -1 : 1;
                });
                Iterator t = ls.iterator();
                while (t.hasNext()) {
                    System.out.print(t.next());
                }
                System.out.println();
            }
        }catch (Exception e){

        }

    }


}
