package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=Integer.parseInt(br.readLine());
        if (s%4==0||s%7==0||s%47==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
