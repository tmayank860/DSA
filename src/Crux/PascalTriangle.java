package Crux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
        for (int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0||j==i){
                    list.add((1));
                }else {
                    list.add(ls.get(i-1).get(j-1) + ls.get(i-1).get(j));
                }

            }
            ls.add(list);
        }
        for (int i=0;i<ls.size();i++){
            int j=0;
            while (j<=i) {
                System.out.print(ls.get(i).get(j)+" ");
                j++;
            }
            System.out.println();
        }

    }

}
