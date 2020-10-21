package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseWordsinaGivenString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] a = br.readLine().split("\\.");
            for (int i=a.length-1;i>0;i--){
                System.out.print(a[i]+".");
            }
            System.out.println(a[0]);

        }
    }
}
