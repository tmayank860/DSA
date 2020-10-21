package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PetyaAndStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a[] = br.readLine().toCharArray();
        char[] b=br.readLine().toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 92) {
                a[i] += 32;
            }
            if (b[i] < 92) {
                b[i] += 32;
            }
        }
        String s1= Arrays.toString(a);
        String s2= Arrays.toString(b);
       if (s1.equals(s2)){
           System.out.println(0);
       }



    }
}
