package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class FruitSalad {
    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        while (t-- > 0) {
//            try {
//                String[] salad = (br.readLine().split(" "));
//                System.out.println(Arrays.toString(salad));
//                int x = Integer.parseInt(salad[0]);
//                int y = Integer.parseInt(salad[1]);
//                int banana = x / 2;
//                if (banana > y) {
//                    System.out.println(y);
//                } else {
//                    System.out.println(banana);
//                }
//            }
//        catch(Exception e) {
//            return;
//        }
//        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = 1;
//            Integer.parseInt(br.readLine());
            while (t-- > 0) {
                int x=100;
//                Integer.parseInt(br.readLine());
                String[] match = ("CCCCCCCCCCCCCC".split(""));
                int c = 0;
                int n = 0;
                int d = 0;
                System.out.println(Arrays.toString(match));
                for (int i=0;i<match.length ;i++ ){
                    if (Objects.equals(match[i], "C")) {
                        c++;
                    } else if(Objects.equals(match[i], "N")){
                        n++;
                    }else{
                        d++;
                    }
                }
                int cpoint=2*c+d;
                int npoint=2*n+d;
                System.out.println("C "+ cpoint+" chef "+npoint);
                if(cpoint>npoint){
                    System.out.println(60*x);
                }else if(cpoint<npoint){
                    System.out.println(40*x);
                }else{
                    System.out.println(55*x);
                }


            }
        }
        catch(Exception e) {
            return;

        }
    }
}
