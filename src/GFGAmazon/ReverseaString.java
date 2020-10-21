package GFGAmazon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseaString {
    public static void main (String[] args)
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            int t=Integer.parseInt(br.readLine());
            while(t-->0) {
            String s=br.readLine();
            for (int i=s.length()-1;i>=0;i--){
                System.out.print(s.charAt(i)+"");
            }
            System.out.println();

            }
        } catch (Exception e) {

        }

    }
}
