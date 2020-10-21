package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t-->0){
            String s=br.readLine();
            if (s.length()<=10){
                System.out.println(s);
            }else {
                int size=(s.substring(1,s.length()-1).length());
                String result=s.charAt(0)+"";
                result=result+size;
                result=result+s.charAt(s.length()-1);
                System.out.println(result);
            }
        }
    }
}
